class Solution {
    public void duplicateZeros(int[] arr) {
        
        int zero_count[] = new int[arr.length];
        
        zero_count[0] = 0;
        for(int i = 1; i < arr.length; i++)
        {
            zero_count[i] = zero_count[i-1] + ((arr[i-1] == 0) ? 1 : 0);
        }
        
        /*
                    [1,0,2,3,0,4,5,0]

        Zero_count : 0,0,1,1,1,2,2,2
        
        */
        
        int insert_index = arr.length - 1;
        for(int j = arr.length - 1; j >= 0; j--)
        {
            if(j + zero_count[j] < arr.length)
            {
                arr[j+zero_count[j]] = arr[j];
                if(arr[j] == 0 && j+zero_count[j]+1 < arr.length)
                    arr[j+zero_count[j]+1] = arr[j];
            }
        }
        
    }
}