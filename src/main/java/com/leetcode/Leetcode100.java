package com.leetcode;


public class Leetcode100 {
    public static void main(String[] args) {
        
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q != null ||  p != null && q == null){
            return false;
        }else if(p == null && q == null){
            return true;
        }else{
            boolean  res = isSameTree(p.left, q.left);
            if(!res) return false;
            if(p.val != q.val) return false;

        return isSameTree(p.right, q.right);
        }
        
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
