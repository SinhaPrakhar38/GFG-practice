
class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<n;i++){
            if(hm.get(arr[i])>=2){
                return i+1;
            }
        }
        return -1;
    }
}
