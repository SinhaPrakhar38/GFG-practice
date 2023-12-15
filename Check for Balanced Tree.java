class Tree
{
    
    //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root)
    {
	// Your code here
	   if(root==null) return true;
	   
	   int diff = Math.abs(height(root.left)-height(root.right));
	   
	   if(diff>1) return false;
	   
	   return isBalanced(root.left) && isBalanced(root.right);
	
    }
    
    int height(Node root)
    {
        
        if(root==null) return 0;
        
        return 1+Math.max(height(root.left),height(root.right));
        
    }
}
