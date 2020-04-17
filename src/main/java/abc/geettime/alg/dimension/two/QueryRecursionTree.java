package abc.geettime.alg.dimension.two;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：cong_zhang.
 * @date ：Created in 13:12 2020/4/17
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
public class QueryRecursionTree {

    public static void main(String[] args) {
        List<Integer> valList = new ArrayList<Integer>();
        Tree tree = new Tree();
        preOrder(tree.root, valList);
        System.out.println(valList.toString());
        valList.clear();
        inOrder(tree.root, valList);
        System.out.println(valList.toString());
        valList.clear();
        postOrder(tree.root, valList);
        System.out.println(valList.toString());
    }

    public static void preOrder(TreeNode treeNode,List<Integer> valList ){
         if(treeNode != null ){
             valList.add(treeNode.val);
             preOrder(treeNode.left, valList);
             preOrder(treeNode.right,valList);
         }
    }

    public static void inOrder(TreeNode treeNode,List<Integer> valList ){
        if(treeNode != null ){
            preOrder(treeNode.left, valList);
            valList.add(treeNode.val);
            preOrder(treeNode.right,valList);
        }
    }

    public static void postOrder(TreeNode treeNode,List<Integer> valList ){
        if(treeNode != null ){
            preOrder(treeNode.left, valList);
            preOrder(treeNode.right,valList);
            valList.add(treeNode.val);
        }
    }
}
