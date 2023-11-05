class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
         Set<Integer> set = new HashSet<Integer>();
        for(Integer num : arr) {
            if(num<x) {
                if(set.contains(x - num))
                    return true;
                else
                    set.add(num);
            }
        }
        return false;
    }
}
