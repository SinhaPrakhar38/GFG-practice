class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        int mxl[] = new int[n];
        int mxr[] = new int[n];
        
        mxl[0] = arr[0];
        for(int i = 1; i < n; i++){
            mxl[i] = Math.max(mxl[i - 1], arr[i]);
        }
        
        mxr[n - 1] = arr[n - 1];
        for(int i = n - 2; i >= 0; i--){
            mxr[i] = Math.max(mxr[i + 1], arr[i]);
        }
        
        int water[] = new int[n];
        for(int i = 0; i < n; i++){
            water[i] = Math.min(mxl[i], mxr[i]) - arr[i];
        }
        
        long sum = 0;
        for(int i = 0; i < n; i++){
            sum += water[i];
        }
        return sum;
    } 
}
