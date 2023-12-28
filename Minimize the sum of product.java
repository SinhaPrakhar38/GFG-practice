class Solution {
    public long minValue(long a[], long b[], long n) 
    {
        // Your code goes here
        Arrays.sort(a);
        Arrays.sort(b);
        
        for (int i = 0, j = b.length - 1; i < j; i++, j--) {
            long temp = b[i];
            b[i] = b[j];
            b[j] = temp;
        }
        
        long minProductSum = 0;
        
        for(int i=0; i<n; i++){
            minProductSum += a[i]*b[i];
        }
        
        return minProductSum;
    }
}
