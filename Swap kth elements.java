class Solution {
    void swapKth(int arr[], int n, int k) {
        // code here
        int temp = arr[n-k];
        arr[n-k] = arr[k-1];
        arr[k-1] = temp;
    }

}
