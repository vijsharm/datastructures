public class GoodNodesInBinaryTree {
    //Given a binary tree root, a node X in the tree is named good if in the path from root to X there are no nodes with a value greater than X.
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        TreeNode root= new TreeNode(3);
        root.left=  new TreeNode(1);
        root.right=  new TreeNode(4);
        root.left.left=  new TreeNode(3);
        root.right.left=  new TreeNode(1);
        root.right.right=  new TreeNode(5);
        System.out.println(goodNodes(root, max));

    }

    private static int goodNodes(TreeNode node, int mx) {
        int curr = 0;
        if (node == null) {
            return 0;
        }
        if (node.val >= mx) {
            mx = node.val;
            curr++;
        }

        return goodNodes(node.left, mx) + goodNodes(node.right, mx) + curr;
    }

}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
