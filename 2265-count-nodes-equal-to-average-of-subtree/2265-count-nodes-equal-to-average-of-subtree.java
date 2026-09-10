class Solution {

    int ans = 0;

    class Info {
        int sum;
        int count;

        Info(int sum, int count) {
            this.sum = sum;
            this.count = count;
        }
    }

    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return ans;
    }

    public Info dfs(TreeNode root) {

        if (root == null) {
            return new Info(0, 0);
        }

        Info left = dfs(root.left);
        Info right = dfs(root.right);

        int sum = root.val + left.sum + right.sum;
        int count = 1 + left.count + right.count;

        int average = sum / count;

        if (average == root.val) {
            ans++;
        }

        return new Info(sum, count);
    }
}