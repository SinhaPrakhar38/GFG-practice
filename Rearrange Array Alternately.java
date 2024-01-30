class Solution{
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(long arr[], int n){
        
        // Your code here
        int a=0;                                   
        ArrayList<Long>al=new ArrayList<>();    
        ArrayList<Long>als=new ArrayList<>();   
        ArrayList<Long>alss=new ArrayList<>();  
        int mid =(a+n)/2;                          
        for(int i=0;i<mid;i++){                    
            al.add(arr[i]);                        
        }                                          
        for(int i= arr.length-1;i>=mid;i--){       
            als.add(arr[i]);                       
        }                                          
        for(int i=0;i< als.size();i++){            
            alss.add(als.get(i));                  
            if(al.size()>i){                       
                alss.add(al.get(i));             
            }                                      
        }                                          
        for(int i=0;i<arr.length;i++){             
            arr[i]=alss.get(i);                   
        }        
        
    }
    
}
