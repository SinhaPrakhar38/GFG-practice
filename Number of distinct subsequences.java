class Solution {
    int distinctSubsequences(String s) {
        // code here
        int mod = 1000000007;
        int dp[] = new int[s.length()+1];
        dp[0] = 1;
        
        int ch[] = new int[26];
        
        for(int i=1;i<dp.length;i++){
            int val = ch[s.charAt(i-1)-'a'];
            dp[i] = ((2 * dp[i-1])%mod) - val;
            dp[i] %= mod;
            ch[s.charAt(i-1) - 'a'] = dp[i-1];
        }
        int ans = (dp[s.length()]+mod)%mod;
        return ans;
    }
}
