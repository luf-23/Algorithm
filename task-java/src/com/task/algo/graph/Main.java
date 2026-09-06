package com.task.algo.graph;

import com.task.common.TreeNode;

public class Main {
    public static void main(String[] args) {
        TreeNode<Integer> root = TreeNode.build(new Integer[]{1,2,3,4,5,6,7,8,9,10});
        System.out.println(BinaryTree.preOrder(root));
        System.out.println(BinaryTree.inOrder(root));
        System.out.println(BinaryTree.postOrder(root));
    }
}
