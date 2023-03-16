class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
     
        int count = 0, max_count = 0;
        int i = 0;       

        while(i < nums.length)
        {
            if(nums[i] == 1)
                count++;
            else
            {
                count = 0;
            }
            if(max_count < count)
                    max_count = count;
            i++;
        }
        
        return max_count;
    }
}