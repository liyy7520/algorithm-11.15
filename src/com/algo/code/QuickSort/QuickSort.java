package com.algo.code.QuickSort;

/**
 * @program: algorithm-11.15
 * @description: 快排
 * @author: Mr.Wang
 * @create: 2018-12-02 17:35
 **/
public class QuickSort {

    public static void quickSort(int[] sort){

        if(sort!=null) {
            quickSortInternally(sort,0,sort.length-1);
        }else {
            throw new IllegalArgumentException("Input paramenter for array to sort is null.");
        }
    }
    //递归快速排序
    public static void quickSortInternally(int[] sort,int q,int p){

        if (q>=p)return;
        int pivot =pivotPartition(sort,q,p);
        quickSortInternally(sort,q,pivot-1);
        quickSortInternally(sort,pivot+1,p);
    }

    //寻找基准值，进行分区
    private static int pivotPartition(int[] sort,int firstp,int lastq){
        int pivot = sort[lastq];
        int i= firstp;
        for (int j = firstp; j <lastq; j++) {
            //如果元素大于基准值，则交换位置
            if(sort[j]>pivot){
                int temp = sort[i];
                sort[i]= sort[j];
                sort[j]=temp;
                ++i;
            }
        }
        int temp =sort[i];
        sort[i] = sort[lastq];
        sort[lastq] = temp;
        for (int k = 0; k < sort.length; k++) {
            System.out.print(sort[k]+" ");
        }
        System.out.println("i= "+i);
        return i;
    }

    public static void main(String[] args) {
        int[] s = new int[]{1,2,23,3,44,8,9,45,5,7,6};
        QuickSort.quickSort(s);

        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]+" ");
        }

    }



}
