package com.algo.code.array;

/*
* 1）数组的插入、删除，并随机根据下标访问操作，动态扩容
*
* 2）数组中的数据类型是int类型
*
*
* */
public class Array {

    //定义一个
    private int data[];
    //定义数组长度
    private int n;
    //定义数组的保存个数
    private int count;


    public Array(int capacity) {
        this.data = new int[]{0,1,2,3,4,5,6};
        this.n = capacity;
        this.count = capacity;
    }

    //根据索引查找某个索引的元素
    public int findByIndex(int index){
        if(index <0||index >=count)return -1;
        return data[index];
    }

    public boolean deleteByIndex(int index){
        if(index<0||index>=count)return false;
        for (int i=index+1;i<count;++i){
            data[i-1]=data[i];
        }
        --count;
        return true;
    }

    public boolean insert(int index, int value){
        if(index<0||index>=count)return false;
        int[] arr =new int[count+1];
        for (int i=0;i<data.length;i++){
            arr[i]=data[i];
        }
        data =arr;

        for (int j=count-1;j>=index;--j){
            data[j+1]=data[j];
        }
        data[index]=value;
        ++count;
        return true;
    }

    public boolean insertToTail(int value){
        int[] arr = new int[count+1];
        for (int i=0;i<data.length;i++){
            arr[i]=data[i];
        }
        data=arr;
        data[count++]=value;
        return true;
    }

    public void printAll(){

        for (int i=0;i<count; i++){
            System.out.println(data[i]+"");
        }
        System.out.println("");
    }
}
