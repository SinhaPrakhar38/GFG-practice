class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        ArrayList<Integer>ans=new ArrayList<>();
        pre(ans,root);
        return ans;
        }
        static void pre(ArrayList<Integer>a,Node root){
         if(root==null){
            return;
         }
        a.add(root.data);
        pre(a,root.left);
        pre(a,root.right);
    }

}
