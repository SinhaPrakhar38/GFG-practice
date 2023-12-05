class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
            
        // Your code here
        if (n == 0) {
            return 0;
        }
        int pos = 1;
        while ((n & 1) == 0) {
            n = n >> 1;  
            pos++;
        }
        return pos;
            
    }
}
