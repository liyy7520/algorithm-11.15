package com.algo.code.ShellSort;

/**
 * @program: algorithm-11.15
 * @description: 希尔排序
 * @author: Mr.Wang
 * @create: 2018-12-02 15:17
 **/
public class ShellSort {


        public static void sort(int[] collection) {
            if (collection != null) {
                shellSort(collection);
            } else {
                throw new IllegalArgumentException("Input paramenter for array to sort is null.");
            }
        }

        private static void shellSort(int[] collection) {
            int arrayLength = collection.length;

            for (int gap = arrayLength / 2; gap > 0; gap /= 2) {
                for (int i = gap; i < arrayLength; i++) {
                    int newElement = collection[i];

                    int j = i;
                    while (j >= gap && collection[j - gap] > newElement) {
                        collection[j] = collection[j - gap];
                        j -= gap;
                    }
                    collection[j] = newElement;
                }
            }
        }


    public static void main(String[] args) {
            int[] a  = new int[]{1,23,3,45,3,3,45,5,5,6};
        ShellSort.shellSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
