class Solution{
     static int palindromicPartition(String str)
    {
        int n = str.length();
        int dp[] = new int[n];
        
            Arrays.fill(dp , -1);
    
        return count(0 , n , str , dp) - 1;
    }
    static int count(int i , int n , String s , int dp[]){
        
        if(i == n) return 0;
        
        if(dp[i] != -1) return dp[i];
        
        int ans = Integer.MAX_VALUE;
        
        for(int j = i ; j < n ; j++ ){
            
            if(isPalindrome(i , j , s)){
                int cost = 1 + count(j+1 , n , s , dp);
                ans = Math.min(ans , cost);
            }
        }
        return dp[i] = ans;
    }
    static boolean isPalindrome(int i , int j , String s){
        
        while(i < j){
            if(s.charAt(i) != s.charAt(j)) return false;
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}
