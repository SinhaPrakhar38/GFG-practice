class Tree
{
    static ArrayList<Integer> ans;
    static ArrayList<Integer> leftView(Node node)
    {
      ans = new ArrayList<>();
      leftV(node, 0);
      return ans;
    }
    static void leftV(Node node, int level)
    {
        if(node == null)
        return;
        
        if(ans.size() == level)
            ans.add(node.data);
        
        leftV(node.left, level+1);
        leftV(node.right, level+1);
        return;
    }
}
