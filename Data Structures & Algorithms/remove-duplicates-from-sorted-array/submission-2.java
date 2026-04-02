class Solution {
    public int removeDuplicates(int[] nums) {
        
        int[] arrayWithoutDuplicateItems = Arrays.stream(nums).distinct().toArray();

        for (int i = 0; i < arrayWithoutDuplicateItems.length; i++) {
            nums[i] = arrayWithoutDuplicateItems[i];
        }

        return arrayWithoutDuplicateItems.length;
    }
}