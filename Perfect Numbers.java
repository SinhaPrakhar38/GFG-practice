class Solution {
    static int isPerfectNumber(long N) {
        // code here
        long sum = 0 ;
        
        if(N==1){
            return 0;
        }
        for(int i = 1  ; i<=Math.sqrt(N); i++)
        {
            if(N%i==0){
                sum = sum+i;
            if(i*i!=N && N/i!=N){
                 
                 sum=sum+N/i;
                
             }
            }
        }
        if(sum==N)
        {
            return 1;
        }
        
        return 0;
    }
}
