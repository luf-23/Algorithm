package com.task.leetcode;

public class _42 {
    // 42. 接雨水
    //对于下标i处能接的雨水等于两边柱子最大高度的较小值减去当前柱子高度
    public int trap(int[] height) {
        if (height == null || height.length == 0) return 0;
        int n = height.length;
        int []num = new int [n+1];
        int []preMax = new int[n+1];
        int []sufMax = new int[n+2];
        for (int i=1;i<=n;i++){
            num[i] = height[i-1];
            preMax[i] = Math.max(preMax[i-1], num[i]);
        }
        for (int i=n;i>=1;i--) sufMax[i] = Math.max(sufMax[i+1],num[i]);
        int ans = 0;
        for (int i=1;i<=n;i++) ans += Math.max(0,Math.min(preMax[i-1],sufMax[i+1])-num[i]);
        return ans;
    }
}
