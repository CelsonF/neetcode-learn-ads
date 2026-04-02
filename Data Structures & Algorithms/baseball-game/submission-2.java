class Solution {
    public int calPoints(String[] operations) {
    
    //Stack version
    Stack<Integer> stack = new Stack<>();

            for(String op : operations) {
                if(op.equals("+")) {
                    int top = stack.pop();
                    int newTop = top + stack.peek();

                    stack.push(top);
                    stack.push(newTop);
                } else if (op.equals("D")) {
                    stack.push(2 * stack.peek());
                } else if (op.equals("C")) {
                    stack.pop();
                } else {
                    stack.push(Integer.parseInt(op));
                }
            }

            return stack.stream().reduce(0, Integer::sum);
    

    }
}