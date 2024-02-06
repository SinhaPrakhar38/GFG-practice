class Solution{
    static int evenlyDivides(int N){
        // code here
        int count=0;
        int x=N;
      
        while(x>0){
           int L_digit=x%10;
           if(L_digit!=0 && N%L_digit==0){
               count++;
           }
            x=x/10;
        }
        return count;
    }
}
