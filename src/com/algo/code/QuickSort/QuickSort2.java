package com.algo.code.QuickSort;

/**
 * @program: algorithm-11.15
 * @description: 快排
 * @author: Mr.Wang
 * @create: 2018-12-02 18:37
 **/
public class QuickSort2 {

    public static void sort(int[] collection) {
        if (collection != null) {
            quickSort(collection, 0, collection.length - 1);
        } else {
            throw new IllegalArgumentException("Input paramenter for array to sort is null.");
        }
    }

    //快排调用递归函数
    private static void quickSort(int[] collection, int firstPosition, int lastPosition) {
        if (firstPosition >= lastPosition) {
            return;
        } else {
            int pivotIndex = partition(collection, firstPosition, lastPosition);
            quickSort(collection, firstPosition, pivotIndex - 1);
            quickSort(collection, pivotIndex + 1, lastPosition);
        }
    }

    //根据基准值分区
    private static int partition(int[] collection, int firstPosition, int lastPosition) {
        //获取基准值index
        int pivotIndex = selectPivot(firstPosition, lastPosition);

        swap(collection, pivotIndex, lastPosition);
        int store = firstPosition;
        pivotIndex = lastPosition;
        for (int i = firstPosition; i <= lastPosition - 1; i++) {
            if (collection[i] <= collection[pivotIndex]) {
                swap(collection, i, store);
                store++;
            }
        }
        swap(collection, store, pivotIndex);
        pivotIndex = store;
        return pivotIndex;
    }

    //交换位置
    private static void swap(int[] collection, int x, int y) {
        int temp = collection[x];
        collection[x] = collection[y];
        collection[y] = temp;
    }

    //选择基准点
    private static int selectPivot(int first, int last) {
        return (first + last) / 2;
    }

    public static void main(String[] args) {
        int[] s = new int[]{1, 1, 23, 3, 45, 3, 3, 45, 5, 5, 6};
        sort(s);
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }

    }
}
