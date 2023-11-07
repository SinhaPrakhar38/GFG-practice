class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        boolean count[] = new boolean[1000000];
        int max = 0;
        for(int i = 0; i < size; i++) {
            if(arr[i] > 0) {
                count[arr[i]] = true;
            }
            max = Math.max(max, arr[i]);
        }
        
        for(int i = 1; i <= max; i++) {
            if(count[i] == false) return i;
        }
        return max + 1;
    }
}
