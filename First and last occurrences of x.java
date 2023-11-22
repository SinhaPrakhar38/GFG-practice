class GFG
{
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int start = 0;
        int end = n-1;
        int ans = -1;
        
        while(start <= end){
            
           int mid = start + (end - start)/2;
           
           //find first occurance
           if(x == arr[mid]){
               ans = mid;
               end = mid-1;
           }else if(x < arr[mid]){
               end = mid-1;
           }else if(x > arr[mid]){
               start = mid+1;
           }
           //mid = start + (end-start)/2;
           
        }
        
        list.add(ans);
        
        //find last Occurance
        start = 0;
        end = n-1;
        
        while(start <= end){
            int mid = start + (end-start)/2;
            if(x == arr[mid]){
               ans = mid;
               start = mid+1;
           }else if(x < arr[mid]){
               end = mid-1;
           }else if(x > arr[mid]){
               start = mid+1;
           }
        }
        list.add(ans);
        
        return list;
    }
}
