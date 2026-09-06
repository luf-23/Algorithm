package com.task.algo.graph;

import com.task.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    public static <T> List<T> preOrder(TreeNode<T> root) {
        List<T> result = new ArrayList<>();
        preOrder(root, result);
        return result;
    }

    public static <T> List<T> inOrder(TreeNode<T> root) {
        List<T> result = new ArrayList<>();
        inOrder(root, result);
        return result;
    }

    public static <T> List<T> postOrder(TreeNode<T> root) {
        List<T> result = new ArrayList<>();
        postOrder(root, result);
        return result;
    }

    private static <T> void preOrder(TreeNode<T> root, List<T> result) {
        if (root == null) return;
        result.add(root.value);
        preOrder(root.left, result);
        preOrder(root.right, result);
    }
    private static <T> void inOrder(TreeNode<T> root, List<T> result) {
        if (root == null) return;
        inOrder(root.left, result);
        result.add(root.value);
        inOrder(root.right, result);
    }
    private static <T> void postOrder(TreeNode<T> root, List<T> result) {
        if (root == null) return;
        postOrder(root.left, result);
        postOrder(root.right, result);
        result.add(root.value);
    }
}
