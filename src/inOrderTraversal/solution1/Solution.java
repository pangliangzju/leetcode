package inOrderTraversal.solution1;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    public List<Integer> inOrderTraversal(TreeNode root){
        List<Integer> res=new LinkedList<>();
        inorder(root,res);
        return res;
    }

    public void inorder(TreeNode root,List<Integer> res){
        if(root==null){
            return;
        }
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
    }



}
