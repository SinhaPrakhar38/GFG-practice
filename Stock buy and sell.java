class Solution{
    //Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
        // code here
        ArrayList<ArrayList<Integer> > res = new ArrayList<>();
        for(int i=1;i<n;i++){
            if(A[i]>A[i-1]){
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(i-1);
                temp.add(i);
                res.add(temp);
            }
        }
        return res;
    }
}
