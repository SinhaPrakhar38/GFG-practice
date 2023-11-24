class Solution {
    public long count(int coins[], int N, int sum) {
        // code here.
        long dp[] = new long [sum + 1];
         dp[0] = 1;
        for (int i = 0; i < N; i++)
            for (int s = coins[i]; s <= sum; s++) {
                dp[s] = dp[s] + dp[s - coins[i]];

            }

        return dp[sum];
    }
}
