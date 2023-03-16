class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int[] result = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++)
            nums[i] = nums[i] *nums[i];

        int i = nums.length-1, j = 0, k = nums.length-1;
        
        while(j <= k)
        {
            if(nums[j] > nums[k])
            {
                result[i] = nums[j];
                j++;
            }
            else
            {
                result[i] = nums[k];
                k--;
            }
            
            i--;
        }
        
        return result;
        
         
        
        
    }
}