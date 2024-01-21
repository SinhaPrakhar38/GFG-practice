
class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        //Your code here
        long x=0,y=1;
        long s[]=new long[n];
        s[0]=1;
        for(int i=1;i<n;i++){
            s[i]=x+y;
            x=s[i-1];
            y=s[i];
        }
        return s;   
    }
}
