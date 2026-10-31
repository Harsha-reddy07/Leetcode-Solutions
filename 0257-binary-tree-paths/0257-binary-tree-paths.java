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
    public List<String> binaryTreePaths(TreeNode root) {
        return helper(root,"");
    }
        public List<String> helper(TreeNode root , String path){
            ArrayList<String> list = new ArrayList<>();
            if(root == null){
                return list;
            }
            if(path.isEmpty()){
                path += root.val;
            }
            else{
                path += "->" + root.val;
            }
            if(root.left == null && root.right == null){
                list.add(path);
                return list;
            }
            list.addAll(helper(root.left , path));
            list.addAll(helper(root.right , path));
            return list;
        }
}