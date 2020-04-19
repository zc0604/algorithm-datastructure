package abc.geettime.alg.dimension.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @Description
 * @auther cong zhang
 * @email zc.bjut@gmail.com
 * @create 2020-04-19 11:12
 */
public class ValidateBinarySearchTree {
    public static void main(String[] args) {
        Solution solution = new ValidateBinarySearchTree().new Solution();
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    class Solution {

        public boolean isValidBST2(TreeNode root) {
            Long inOrderValue = Long.MIN_VALUE ;
            Stack<TreeNode> stack = new Stack<TreeNode>();
            while( !stack.isEmpty() || root != null){
                while(root!= null){
                    stack.push(root );
                    root = root.left ;
                }
                root = stack.pop() ;
                if( root.val <= inOrderValue) return false ;
                inOrderValue = Long.parseLong(root.val + "");

                root =root.right ;
            }
            return true ;
        }

        public boolean isValidBST(TreeNode root) {
            if( root == null ){
                return true ;
            }
            List<Integer> list = new ArrayList<Integer>();
            inOrder(root, list );
            if( list .size() > 0 ){
                if(list.size() == 1 ){
                    return true ;
                }
                for( int i = 0 ; i < list.size()-1 ;  i++){
                    if( list.get(i).compareTo(list.get(i+1)) >=0  ){
                        return false ;
                    }
                }
            }
            return true ;
        }

        private void inOrder(TreeNode root,List<Integer> list){
            if( root == null) {
                return ;
            }
            inOrder(root.left, list);
            list.add(root.val);
            inOrder(root.right,list);
        }

    }
}
