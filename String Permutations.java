class Solution
{
    public ArrayList<String> permutation(String S)
    {
        //Your code here
        ArrayList<String> l=new ArrayList<>();
        char arr[]=S.toCharArray();
        per(arr,l,0);
        Collections.sort(l);
        return l;
    }
    public void per(char arr[], ArrayList<String> a,int i){
        if(i==arr.length-1){
            String str=String.valueOf(arr);
            a.add(str);
            return;
        }
        for(int j=i;j<arr.length;j++){
            swap(arr,i,j);
            per(arr,a,i+1);
            swap(arr,j,i);
        }
    }
    public void swap(char arr[],int l,int h){
            char temp=arr[l];
            arr[l]=arr[h];
            arr[h]=temp;
    }
       
}
