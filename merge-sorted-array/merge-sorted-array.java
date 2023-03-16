class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int j = m-1, k = n-1, i = m+n-1;
        while( i >= 0 && j >= 0 && k >= 0)
        {
            if(nums1[j] > nums2[k])
            {
                nums1[i] = nums1[j];
                j--;
            }
            else
            {
                nums1[i] = nums2[k];
                k--;
            }
            i--;
        }
        
        while(j >= 0)
        {
            nums1[i] = nums1[j];
            i--; 
            j--;
        }
        
        while(k >= 0)
        {
            nums1[i] = nums2[k];
            i--;
            k--;
        }
            
        
        
        
    }
}