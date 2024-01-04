class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node root) {
        //add code here.
         ArrayList<Integer> ans= new ArrayList<>();
      ln(root,1,ans);
      return ans;
    }
    static void ln(Node root, int lev,ArrayList<Integer>  ans){
        
        if(root==null) return;
        if(lev>ans.size()) ans.add(root.data);
 
         ln(root.right,lev+1,ans);
                ln(root.left,lev+1,ans);
    }
    }
