class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int i=0;
        int j=0,res=1,curr=0;
        while(i<n ){
            if(arr[i] <= dep[j]){
                curr++;
                i++;
            }else{
                curr--;
                j++;
                
            }
            res=Math.max(curr,res);
        }
        return res;
        
    }
    
}
