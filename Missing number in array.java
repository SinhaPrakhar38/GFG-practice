class Solution {
    int missingNumber(int array[], int n) {
        // Your Code Here
         return ((1 + n) * n / 2) - Arrays.stream(array).sum();
    }
}
