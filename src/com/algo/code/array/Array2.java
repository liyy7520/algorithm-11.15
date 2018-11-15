package com.algo.code.array;

/**
 * @program: algo
 * @description:
 * @author: liyy
 * @create: 2018-10-12 11:09
 **/
public class Array2 {
    private int[] data;
    private int n;
    private int count;

    public Array2(int capacity){
        this.data =new int[]{0,1,2,3,4,5};
        this.n = capacity;
        this.count = capacity;
    }

    public boolean insertByTail(int value){
        int[] arr = new int[count+1];

        for (int i=0;i<data.length;i++){
            arr[i]=data[i];
        }
        data=arr;
        data[count++] = value;
        ++count;
        return true;
    }

    public int find(int index){
        if(index<0||index>=count)return -1;

        return data[index];
    }

    public boolean insertByIndex(int index,int value){
        if(count==n)return false;
        if(index<0||index>count)return false;
        for (int i =count;i>index;--i){
            data[i]=data[i-1];
        }
        data[index]=value;
        ++count;
        return true;
    }

    public boolean delete(int index){
        if(index<0||index>=count)return false;
        for (int i=index+1;i<count;++i){
            data[i-1]=data[i];
        }
        --count;
        return true;
    }

    public void printAll(){
      for (int i=0;i<count;i++){
          System.out.print(" data[] ="+data[i]+"");
      }
    }
 }
