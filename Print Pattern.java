class Solution{
    public List<Integer> pattern(int N){
        // code here
        List<Integer> list = new ArrayList<>();
        func(list, N, false, N);
        return list;
    }
    public void func(List<Integer> list, int N, boolean flag, int a){
        if(N<=0){
            flag = true;
        }
        if(N>0 && flag==false){
            list.add(N);
            func(list, N-5,flag, a);
        }
        else{
            list.add(N);
            if(N==a)return;
            func(list,N+5, true, a);
            
        }
    }
}
