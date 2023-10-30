class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        int []a=new int[n];
        Arrays.fill(a,0);
        for(int i=0;i<n;i++){
          a[arr[i]]=a[arr[i]]+1;
        }
        for(int i = 0; i < n; i++) {
            if(a[i] > 1) {
               res.add(i); 
            }
        }
        if(res.size()==0){
            res.add(-1);
        }
        return res;
    }
}
