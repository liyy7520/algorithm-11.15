package com.algo.code.BubbleSort;

/**
 * @program: algo
 * @description: 冒泡排序，a表示数组，n表示数组大小
 * @author: liyy
 * @create: 2018-10-22 10:30
 **/
public class BubbleSort {

    public void bubbleSort(int[] a,int n){
        if(n<=1)return;
        
        for (int i=0;i<n;i++){
//            提前退出冒泡排序的标志位
            boolean flag = false;
            for (int j = 0; j < n-1; j++) {
                if(a[j]>a[j+1]){
                    //交换位置
                    int tmp = a[j];
                    a[j]= a[j+1];
                    a[j+1]=tmp;
                    flag=true; //表示没有数据交换了
                }
            }
            if (!flag)break;  //没有数据交换了，退出排序
        }
        
    }

    public static void main(String[] args) {
        int[] a=new  int[]{1,5,3,6,2,3,5,6,7,8};
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(a,a.length);
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+",");
        }
    }
}
