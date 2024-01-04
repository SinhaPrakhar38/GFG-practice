class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        int len = (n + m);
        int gap = (len / 2) + (len % 2);
        
        while(gap > 0){
            
            int left = 0;
            int right = left + gap;
            
            while(right < len){
                // both are in left array
                 if (left < n && right < n) {
                    if (arr1[left] > arr1[right]) {
                        long temp = arr1[left];
                        arr1[left] = arr1[right];
                        arr1[right] = temp;
                    }
 
                } else if (left >= n && right >= n) {
                    if (arr2[left - n] > arr2[right - n]) {
                        long temp = arr2[left - n];
                        arr2[left - n] = arr2[right - n];
                        arr2[right - n] = temp;
                    }
 
                } else {
                    if (arr1[left] > arr2[right - n]) {
                        long temp = arr1[left];
                        arr1[left] = arr2[right - n];
                        arr2[right - n] = temp;
                    }
                }
                left++;
                right++;
            }
        
        
            if(gap == 1)
                gap = 0;
            else
                gap = (gap/2) + (gap % 2); 
            
        }
        
        
        
    }
}
