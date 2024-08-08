/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
       boolean initializer=false;
       Stack<TreeNode> s=new Stack<>();
       TreeNode current=root;
       int temp=-1;
       while(current!=null || !s.isEmpty()){
        while(current!=null){
            s.push(current);
            current=current.left;
        }
        current=s.pop();
        if(initializer==false){
             temp=current.val;
             initializer=true;
        }
        else{
            if(current.val<=temp)
                  return false;
            temp=current.val;
        }
        current=current.right;

       }
       return true;
    }
   
}