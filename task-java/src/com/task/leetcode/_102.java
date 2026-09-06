package com.task.leetcode;

import com.task.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        List<List<Integer>> ans = new ArrayList<>();
        while (!queue.isEmpty()){
            Queue<TreeNode<Integer>> nextQueue = new LinkedList<>();
            List<Integer> level = new ArrayList<>();
            while (!queue.isEmpty()){
                TreeNode<Integer> now = queue.poll();
                level.add(now.value);
                if (now.left != null) nextQueue.add(now.left);
                if (now.right != null) nextQueue.add(now.right);
            }
            ans.add(level);
            queue = nextQueue;
        }
        return ans;
    }
}
