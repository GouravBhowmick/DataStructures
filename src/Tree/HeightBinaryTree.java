package Tree;


import com.sun.source.tree.Tree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class HeightBinaryTree {

    public static int height(TreeNode root){

        if(root == null){
            return 0;
        }
        else{
            return Math.max(height(root.left), height(root.right)) + 1;
        }
    }

    public static int maxHeightSum(TreeNode root){

        if(root == null){
            return 0;
        }
        else{
            return root.val + (Math.max(maxHeightSum(root.left), maxHeightSum(root.right)));
        }

    }


    public static void main(String[] args) {

        TreeNode root =  new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(6);

        System.out.println(HeightBinaryTree.height(root));
        System.out.println(maxHeightSum(root));


    }
}
