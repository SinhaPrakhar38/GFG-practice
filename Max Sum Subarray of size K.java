class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        long currentSum = 0;

        for (int i = 0; i < K; i++) {
            currentSum += Arr.get(i);
        }

        long maxSum = currentSum;

        for (int i = K; i < N; i++) {
            currentSum = currentSum + Arr.get(i) - Arr.get(i-K);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
