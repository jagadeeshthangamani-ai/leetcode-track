// Last updated: 7/14/2026, 2:00:33 PM
class Solution {
    private List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        helper(root, 0);
        Collections.reverse(list);
        return list;
    }
    
    private void helper(TreeNode root,int height){
        if(root == null)
        return;

        if(list.size() == height)
        list.add(new ArrayList<>());

        list.get(height).add(root.val);
        helper(root.left,height + 1);
        helper(root.right,height + 1);
    }
}