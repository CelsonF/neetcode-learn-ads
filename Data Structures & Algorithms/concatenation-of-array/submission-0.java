class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int sizeNewArray = nums.length;
        int[] ans = new int[2 * sizeNewArray];
        

        for(int i = 0; i < sizeNewArray; i++) {
           ans[i] = nums[i];
           ans[i + sizeNewArray] = nums[i];
        }
    
        return ans;
    }
}