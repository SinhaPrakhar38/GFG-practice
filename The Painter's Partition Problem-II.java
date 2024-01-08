class Solution{
    static long minTime(int[] arr,int n,int k){
        //code here
             long sum = 0;
             for(int i = 0; i<n; i++) sum+=arr[i];
             return helper(arr, arr[n-1],sum,k,-1);
    }
    public static long helper(int[] arr, long start , long end , int k, long ans){
        if( start <= end){
            long mid = start + (end-start)/2;
            if(isPossible(arr,k,mid)){
                ans = mid;
                return helper(arr,start,mid-1,k,ans);
            }else{
                return helper(arr, mid+1,end, k, ans);
            }
        }
        return ans;
    }
    public static boolean isPossible(int[] arr, int k ,long mid){
        int painter = 1, boards = 0;
        for(int i = 0; i<arr.length; i++){
            if(boards + arr[i] <= mid){
                boards+=arr[i];
            }else{
                painter++;
                if(painter > k || arr[i] > mid) return false; 
                
                boards = arr[i];
            }
        }
        return true;
    }
}
