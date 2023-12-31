class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        int i=0;
        int j=0;
        long sum=0;
        while(j<n){
            sum +=arr[j];
            
            while(i<j&&sum>s){
                sum-=arr[i];
                i++;
            }
            
            if(sum==s){
                ans.add(i+1);
                ans.add(j+1);
                return ans;
            }
            j++;
            
        }
        
        ans.add(-1);
        return ans;
    }
}
