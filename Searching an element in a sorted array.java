class Solution{
    static int searchInSorted(int arr[], int N, int K)
    {
        //code here
         if(binarySearch(arr,0,N-1,K)!=-1) return 1;
         return -1;
    }
    static int binarySearch(int[] arr, int low, int high,int key){
        int mid = low+high>>>1;
        if (low>high) return -1;
        else if (arr[mid]==key) return mid;
        return arr[mid]>key ? binarySearch(arr,low,mid-1,key) : binarySearch(arr,mid+1,high,key);
    }
}
