package abc.geettime.alg.dimension.two;

/**
 * @author ：cong_zhang.
 * @date ：Created in 13:10 2020/4/17
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
public class Tree {

    public TreeNode root;

    public Tree() {
        root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);

        root.left = left;
        root.right = right;
    }
}
