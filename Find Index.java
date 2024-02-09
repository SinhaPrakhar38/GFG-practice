
class Solution
{ 
    // Function to find starting and end index 
    static int[] findIndex(int a[], int N, int key) 
    { 
        //code here.
        int start = -1;
        int end = -1;
        for(int i=0;i<N;i++){
            if( a[i]== key){
                start = i;
                break;
            }
        }
        for(int i=N-1;i>=0;i--){
            if(a[i]==key){
                end =i;
                break;
                
            }
        } 
       
        return new int[]{start, end};
    
    }
}
