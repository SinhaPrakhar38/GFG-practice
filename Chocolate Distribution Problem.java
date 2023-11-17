class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        if(m>n)return -1;
        Collections.sort(a);
        long curr=0,res=Integer.MAX_VALUE;
        
            curr=a.get(m-1)-a.get(0);
            res=Math.min(curr,res);
        
        
        for(int i=m;i<n;i++){
            curr=a.get(i)-a.get(i+1-m);
            res=Math.min(curr,res);
        }
        
        return res;
    }
}
