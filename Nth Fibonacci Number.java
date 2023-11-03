class Solution {
    static int nthFibonacci(int n){
        // code here
        int mod=1000000007;
        int dp[]=new int[n+1];
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<n+1;i++){
            dp[i]=(dp[i-1]%mod+dp[i-2]%mod)%mod;
        }
        return dp[n];
    }
}
