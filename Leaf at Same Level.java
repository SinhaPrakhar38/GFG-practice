class Solution
{
    boolean check(Node root)
    {
	// Your code here	
	HashSet<Integer> set = new HashSet<Integer>();
    leafLevel(root,0,set);
    if(set.size()==1)
    return true;
    return false;
    }
    void leafLevel(Node root,int level,HashSet<Integer> set)
    {
        if(root==null)
        return;
        if(root.left==null && root.right==null)
        set.add(level);
        leafLevel(root.left,level+1,set);
        leafLevel(root.right,level+1,set);
    }
}
