class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n1; i++){
            if(i>0 && A[i]==A[i-1]) continue;
            if(search(B,A[i]) && search(C,A[i])) list.add(A[i]);
        }    
        return list;
    }
    
    boolean search(int[] arr, int target){
        int s=0, e=arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid] == target) return true;
            if(arr[mid] < target) s=mid+1;
            else e=mid-1;
        }
        return false;
    }
}
