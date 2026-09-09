package com.task.leetcode;

public class _416 {
    public boolean canPartition(int[] nums) {
        boolean []vis = new boolean[20005];
        vis[0]  =true;
        int sum = 0;
        for (int i=0;i<nums.length;i++){
            sum += nums[i];
            for (int j=20000;j>=nums[i];j--){
                vis[j] |= vis[j-nums[i]];
            }
        }
        for (int i=0;i<=20000;i++){
            if (sum-i<0) continue;
            if (vis[i]&&vis[sum-i]&&i==sum-i) return true;
        }
        return false;
    }
}
