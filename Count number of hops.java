class Solution
{
    
    static long find(int n,long mod,long dp[]){
        if(n==0)return dp[n]=1;
        if(n<0)return 0;
        if(dp[n]!=-1)return dp[n];
        
        return dp[n]=(find(n-1,mod,dp)+find(n-2,mod,dp)+find(n-3,mod,dp))%mod;
    }
    
    
  
    static long countWays(int n)
    {
        long dp[]=new long[n+1];
        Arrays.fill(dp,-1);
        
        long mod=1000000007L;
        return find(n,mod,dp)%mod;
    }
    
}

