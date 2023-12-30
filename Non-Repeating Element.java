class Check{
    
    public int firstNonRepeating(int arr[], int n) 
    { 
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<n;i++){
            if(hm.get(arr[i])==1){
                return arr[i];
            }
        }
        return 0;
    }   
    
}
