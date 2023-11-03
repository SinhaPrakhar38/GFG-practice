class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int ans [] = new int [2];
        int A=1;
        int count  =0;
        
        Arrays.sort(arr);
        for(int i=0; i<n;i++){
            if(i>0&&arr[i]==arr[i-1]){
                ans[0]=arr[i];
                continue;
            }
            if(A!=arr[i]){
                if(count ==0)
                ans[1]=A;
                count++;
            }
            A++;
        }
         
            if(ans[1]==0){
                ans[1]=n;
            }
        return ans;
    }
}
