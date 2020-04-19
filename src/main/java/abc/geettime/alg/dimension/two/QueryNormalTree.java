package abc.geettime.alg.dimension.two;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author ：cong_zhang.
 * @date ：Created in 13:25 2020/4/17
 * @description：${description}
 * @modified By：
 * @version: $version$
 * 对于三种遍历，我们都使用push当前节点->push左子树->pop左子树->push右子树->pop右子树的方式。但是cout时机会有所不同。
 * 对于前序遍历来说，每次访问到一个节点就cout；
 * 对于中序遍历来说，每次将右子节点进栈时，把当前节点cout；
 * 对于后序遍历来说，每次pop的时候cout。
 * 另外我们还需要一个last_pop指针来存放上一个pop出去的节点。
 * 如果当前节点的左右节点都不是上一个pop的节点，那么我们将左子节点入栈；
 * 如果当前节点的左节点是上一个pop的节点，但右节点不是，那么就把右子节点入栈；
 * 否则的话，就需要让当前节点出栈。
 * 注意三种遍历的代码总体结构都是完全一样的，只是cout的时机有所不同。
 */
public class QueryNormalTree {

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

    public static void preOrder(TreeNode root,List<Integer> valList ){
        if(root != null ){
            Stack<TreeNode> stack = new Stack<TreeNode>();
            stack.push(root);
            valList.add(root.val);
            TreeNode lastPop = root ;
            while( !stack.isEmpty()){
                TreeNode top = stack.peek() ;
                if( top.left != null && top.left != lastPop && top.right != lastPop){
                    stack.push(top.left);
                    valList.add(top.left.val);
                }else if( top.right != null && top.right != lastPop && (
                          (top.left == null || top.left == lastPop)
                        )){
                    stack.push(top.right);
                    valList.add(top.right.val);
                }else{
                    lastPop = stack.pop() ;
                }
            }
        }
    }

    public static void inOrder(TreeNode root,List<Integer> valList ){
        if(root != null ){
            Stack<TreeNode> stack = new Stack<TreeNode>();
            stack.push(root);
            TreeNode lastPop = root ;
            while( !stack.isEmpty()){
                TreeNode top = stack.peek() ;
                if( top.left != null && top.left != lastPop && top.right != lastPop){
                    stack.push(top.left);
                }else if( top.right != null && top.right != lastPop && (
                        (top.left == null || top.left == lastPop)
                )){
                    stack.push(top.right);
                    valList.add(top.val);
                }else{
                    lastPop = stack.pop() ;
                    if( top.right == null){
                        valList.add(top.val);
                    }
                }
            }
        }
    }

    public static void postOrder(TreeNode root,List<Integer> valList ){
        if(root != null ){
            Stack<TreeNode> stack = new Stack<TreeNode>();
            stack.push(root);
            TreeNode lastPop = root ;
            while( !stack.isEmpty()){
                TreeNode top = stack.peek() ;
                if( top.left != null && top.left != lastPop && top.right != lastPop){
                    stack.push(top.left);
                }else if( top.right != null && top.right != lastPop && (
                        (top.left == null || top.left == lastPop)
                )){
                    stack.push(top.right);
                }else{
                    lastPop = stack.pop() ;
                    valList.add(top.val);
                }
            }
        }
    }
}
