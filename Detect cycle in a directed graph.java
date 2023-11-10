class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean visited[] = new boolean[V];
        boolean stack[] = new boolean[V];
        for(int i=0;i<V;i++)
        {
            if(!visited[i])
                if(isCycleUtil(adj,visited,stack,i))
                return true;
        }
        return false;
    }
    
    private boolean isCycleUtil(ArrayList<ArrayList<Integer>> adj,boolean visited[],boolean stack[],int curr)
    {
        if(stack[curr])
        return true;
        
        if(visited[curr])
        return false;
        
        visited[curr] = true;
        stack[curr] = true;
        for(int child : adj.get(curr))
        {
            if(isCycleUtil(adj,visited,stack,child))
                return true;
            
        }
        stack[curr] = false;
        return false;
    }
}
