class Solution
{

	public int minDifference(int arr[], int n) 
	{ 
	    int arrSum = 0;
	    for(Integer i : arr)
	        arrSum += i;
	   
	    boolean dp[][] = new boolean[n+1][arrSum+1];
	    for(int i = 0; i <= n ; i++)
	        dp[i][0] = true;
	        
	    for(int i = 1; i<=n ; i++)
	        for(int j = 0; j <= arrSum ; j++){
	            if(arr[i-1] <=j)
	                dp[i][j] = dp[i-1][j] || dp[i-1][j-arr[i-1]];
	            else dp[i][j] = dp[i-1][j];
	        }
	   
	   List<Integer> candidates = new ArrayList<>();
	   for(int j=0 ; j <= arrSum/2 ; j++)
	        if(dp[n][j])
	            candidates.add(j);
	   
	   int min = Integer.MAX_VALUE;
	   for(int i = 0 ; i< candidates.size() ;i++){
	       min = Math.min(min,arrSum - 2*candidates.get(i));
	   }
	   return min;
	} 
}
