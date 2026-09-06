package com.task.common;

public class TreeNode<T> {
    public T value;
    public TreeNode<T> left;
    public TreeNode<T> right;
    public TreeNode() {}

    @SuppressWarnings("unchecked")
    public TreeNode(int value) {
        this.value = (T) Integer.valueOf(value);
        this.left = null;
        this.right = null;
    }
    public TreeNode(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
    public static <T> TreeNode<T> build(T[] values) {
        return build(values,0);
    }
    private static <T> TreeNode<T> build(T[] values, int index) {
        if (index >= values.length || values[index] == null) return null;
        TreeNode<T> now = new TreeNode<>(values[index]);
        now.left = build(values,(index+1)*2-1);
        now.right = build(values,(index+1)*2);
        return now;
    }

    @Override
    public String toString() {
        //先序遍历
        String result = value.toString() + " ";
        if (left != null) result += left.toString();
        if (right != null) result += right.toString();
        return result;
    }
}
