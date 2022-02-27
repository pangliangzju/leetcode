package inOrderTraversal.solution1;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution=new Solution();
        TreeNode root=new TreeNode(0,null,null);
        List<Integer> res=solution.inOrderTraversal(root);
        System.out.println(res.toString());
    }

}
