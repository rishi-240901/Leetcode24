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
     int sum=0;
    public TreeNode bstToGst(TreeNode root) {
       
        helper(root); // yeh help krega apni
        return root;
    }
    public void helper(TreeNode  root){
        if(root==null){
            return;
        }

        helper(root.right); // dekho ple right p jayga usko mtlb jaise 8 krliya add ab vapis aajega 7 p usko addr krliya ab vapis 6 p aagya 21 add krliya 
        sum=sum+root.val;
        root.val=sum;
        helper(root.left);
    }
}