package com.task.algo.sort;

public class MergeSort implements Sort{
    @Override
    public void sort(int[] array) {
        mergeSort(array,0,array.length-1);
    }
    public void mergeSort(int []array,int left,int right){
        if (left>=right || array==null || array.length==0) return;
        int mid = (left+right)/2;
        mergeSort(array,left,mid);
        mergeSort(array,mid+1,right);
        sortArray(array,left,mid,right);
    }
    public void sortArray(int []array,int left,int mid,int right){
        int []temp = new int[right-left+1];
        int pos = 0;
        int i = left;
        int j = mid + 1;
        while (i<=mid && j<=right){
            if (array[i]<=array[j]) temp[pos++] = array[i++];
            else temp[pos++] = array[j++];
        }
        while (i<=mid) temp[pos++] = array[i++];
        while (j<=right) temp[pos++] = array[j++];
        for (int k=0;k<temp.length;k++) array[left+k] = temp[k];
    }
}
