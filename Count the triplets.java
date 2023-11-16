class Solution {
    int countTriplet(int arr[], int n) {
       HashSet<Integer> set = new HashSet<>();
       
       for(int i=0; i<n; i++){
           set.add(arr[i]);
       }
       int count = 0;
       
       for(int i=0; i<n; i++){
           for(int j=i+1; j<n; j++){
               int sum =arr[i] + arr[j];
               if(set.contains(sum)){
                   count++;
               }
           }
       }
       return count++;
       
    }
}
