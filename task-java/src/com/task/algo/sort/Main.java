package com.task.algo.sort;

import com.task.common.PrintUtil;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        Sort quickSort = new QuickSort();
        Sort mergeSort = new MergeSort();
        //quickSort.sort(array);
        mergeSort.sort(array);
        PrintUtil.printArray(array);
    }
}
