class Solution {
    public pair[] allPairs( long A[], long B[], long N, long M, long X) {
        // Your code goes here 
        Arrays.sort(A);
        ArrayList<pair> ans= new ArrayList<>();
        HashSet<Long> h= new  HashSet<>();
        for(long a:B) h.add(a);
      
      for( int i=0;i<A.length;i++) if(h.contains(X-A[i])) ans.add(new pair(A[i],X-A[i]));
      
      pair ansi[]= new pair[ans.size()];
      ans.toArray(ansi);
      return ansi;
    }
}
