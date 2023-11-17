class Solution{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x)
    {
        int s=0,e=n-1,mid,ans=-1;
    
        while(s<=e){
            mid=s+(e-s)/2;
            if(arr[mid]<=x){
                ans=mid;
                s=mid+1;
            }
            else if(arr[mid]>x){
                e=mid-1;
            }
        }
        return ans;
    }
    
}
