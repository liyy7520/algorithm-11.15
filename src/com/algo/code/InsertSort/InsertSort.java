package com.algo.code.InsertSort;

/**
 * @program: algo
 * @description: 插入排序，a表示数组，n表示数组大小
 * @author: liyy
 * @create: 2018-10-22 10:51
 **/
public class InsertSort {

    public static void insertSort(int[] a, int n){
        if (n<=1) return;
        //查找插入的位置
        for (int i = 0; i < n; i++) {
            int value = a[i];
            int j = i-1;
            for (; j >=0 ; --j) {
                if(a[j]>value){
                    a[j+1]= a[j];//数据移动
                }else{
                    break;
                }
            }
            System.out.println("i="+i);
            System.out.println("j="+j);
            a[j+1] =value;  //插入数据
        }


    }


    public static void main(String[] args) {
        int[] a= new int[]{3,4,5,2,4,1,3,4,6,7};
        InsertSort.insertSort(a,a.length);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+",");
        }
    }
}
