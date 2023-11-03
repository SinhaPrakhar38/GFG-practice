class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        //Maintaina a Stack of decreasing order of next element
        Stack<Long> s= new Stack<>();
        
        long[] ans= new long[n];
        
        for(int i=arr.length-1; i>=0; i--){
            
            while(!s.isEmpty() && s.peek()<= arr[i]){
                s.pop();
            }
            
            
            ans[i]= s.isEmpty()? -1 : s.peek();
            
            s.push(arr[i]);
        }
        
        return ans;
    } 
}
