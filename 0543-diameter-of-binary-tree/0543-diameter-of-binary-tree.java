class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int a = levels(root.left) + levels(root.right); // yeh hamare current node ka diameter dekhega
        int b = diameterOfBinaryTree(root.left);  // yeh hamare left ka 
        int c = diameterOfBinaryTree(root.right); // and this is for right 
        return Math.max(a,Math.max(b,c));
    }
    int levels(TreeNode root){
        if(root==null) return 0;
        int leftlevels=levels(root.left);
        int rightlevels=levels(root.right);
        return 1 + Math.max(leftlevels,rightlevels);  // yeh levels ka coee h tumhe pta hi h
    }
}