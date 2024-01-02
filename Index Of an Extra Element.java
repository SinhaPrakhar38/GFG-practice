class Solution {
    public int findExtra(int a[], int b[], int n) {
        // add code here.
        int k=0;
        for(int j=0,i=0;j<n && i<b.length;j++,i++){
            if((a[j]!=b[i])&& i==j){
                k=j;
                break;
            }
            if(a[n-1]!=b[b.length-1]){
                k=n-1;
                break;
            }
        }
        return k;
    }
}
