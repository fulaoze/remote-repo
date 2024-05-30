package org.example;

import java.util.HashMap;

public class tree1 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val){this.val=val;}

    }
    public static void main(String[] args) {
        int []inorder=new int []{9,3,15,20,7};
        int []postorder=new int []{9,15,7,20,3};
        TreeNode node=build(inorder,postorder);
    }
    static HashMap<Integer,Integer>a=new HashMap<>();
    static int []tem;

    public static TreeNode build(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) {
            tem=postorder;

        }
        TreeNode root=build1(0,inorder.length-1,0,tem.length-1);
        return root;
    }

    public static TreeNode build1(int i, int i1, int i2, int i3) {
        if(i1<i||i3<i2)return null;
        int root=tem[i3];
        int b=a.get(root);
        TreeNode node=new TreeNode(root);
        node.left=build1(i,b-1,i2,i2+b-i-1);
        node.right=build1(b+1,i,i2+b-i,i3-1);
        return node;
    }

}
