class Solution {
    public int calPoints(String[] operations) {
    
    List<Integer> record = new ArrayList<>();
    

    for(String op : operations) {
        if(op.equals("+")) {
          int last = record.get(record.size() - 1);
          int secondLast = record.get(record.size() - 2);

          record.add(last + secondLast);

        } else if (op.equals("D")) {
          record.add(record.get(record.size()- 1) * 2);
            
        } else if (op.equals("C")) {
            record.remove(record.size() - 1);

        } else {
            int value = Integer.parseInt(op);

            record.add(value);
        }
    }

    return record.stream().reduce(0,Integer::sum);

    }
}