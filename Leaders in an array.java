class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> al = new ArrayList<>();
        int max = arr[n-1];
        al.add(max);
        
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i] >= max){
                max = arr[i];
                al.add(max);
            }
                
            }
            int r=0;
            int l=al.size()-1;
            
            while(r<l){
                int temp = al.get(r);
                al.set(r,al.get(l));
                al.set(l,temp);
                r++;
                l--;
            }
            return al;
    }
}
