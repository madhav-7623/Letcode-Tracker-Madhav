// Last updated: 11/09/2026, 09:45:47
class Solution {
    int cameras = 0;

    public int minCameraCover(TreeNode root) {
        // If root needs a camera, add one
        if (dfs(root) == 0) {
            cameras++;
        }

        return cameras;
    }

    // 0 = needs camera
    // 1 = covered
    // 2 = has camera
    private int dfs(TreeNode node) {
        if (node == null) {
            return 1; // Null nodes are considered covered
        }

        int left = dfs(node.left);
        int right = dfs(node.right);

        // If any child needs a camera
        if (left == 0 || right == 0) {
            cameras++;
            return 2; // Put camera here
        }

        // If any child has a camera, this node is covered
        if (left == 2 || right == 2) {
            return 1;
        }

        // Both children are covered but have no camera
        return 0;
    }
}