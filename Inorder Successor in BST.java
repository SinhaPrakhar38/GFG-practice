class Solution
{
    // returns the inorder successor of the Node x in BST (rooted at 'root')
    
    int sucessorVal = Integer.MAX_VALUE;
	public Node inorderSuccessor(Node root,Node x)
         {
          //add code here.
          
            inorder(root, x);
            
            if(sucessorVal == Integer.MAX_VALUE) return new Node(-1);
            
            return new Node(sucessorVal);
         }
         
    
    public void inorder(Node root, Node x) {
        
        if(root == null) return;
        
        inorder(root.left, x);
        
        if(x.data < root.data && root.data < sucessorVal) {
            
            sucessorVal = root.data;
        }
        
        inorder(root.right, x);
        
    }
    
}
