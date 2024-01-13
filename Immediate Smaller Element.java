class Solution {
    void immediateSmaller(int arr[], int n) {
        // code here
        int lp = 0;
        int rp = 1;
        
        if(n == 1){
            return;
        }
    
        while(rp <= n-1){
            if(arr[rp] < arr[lp]){
                arr[lp] = arr[rp];
                lp++;
                rp++;
            }else{
                arr[lp] = -1;
                lp++;
                rp++;
            }
        }
        arr[n-1] = -1;
    }
}
