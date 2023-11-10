class Solution 
{
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int size, int a[])
    {
        // code here
        int[] dp = new int[a.length];
        int len = 0;

        for(int x : a) {
            int i = Arrays.binarySearch(dp, 0, len, x);
            if(i < 0) i = -(i + 1);
            dp[i] = x;
            if(i == len) len++;
        }

        return len;
    }
} 
