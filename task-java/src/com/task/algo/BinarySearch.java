package com.task.algo;

public class BinarySearch {
    public static int lower_bound(int[] nums,int left,int right,int target){
        int l = left-1;
        int r = right+1;
        while (l+1 < r){
            int mid = (l+r) / 2;
            int value = nums[mid];
            if (value >= target) r = mid;
            else l = mid;
        }
        return r;
    }
    public static int upper_bound(int[] nums,int left,int right,int target){
        int l = left-1;
        int r = right+1;
        while (l+1 < r){
            int mid = (l+r) / 2;
            int value = nums[mid];
            if (value > target) r = mid;
            else l = mid;
        }
        return r;
    }
}
