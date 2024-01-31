
class Solution {
    int findKRotation(int arr[], int n) {
        // code here
        int count=0;
        int flag=0;
        int ani[]=arr.clone();
        Arrays.sort(ani);
        int first=ani[0];
        for(int i=0;i<n;i++){
            
            if(arr[i]!=first){
                count++;
            }
            else if(arr[i]==first){
                flag=1;
                break;
            }
        }
        if(flag==0){
            return 0;
        }
        return count;
    }
}
