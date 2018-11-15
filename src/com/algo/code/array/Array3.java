package com.algo.code.array;

/**
 * @program: algo
 * @description:
 * @author: liyy
 * @create: 2018-10-17 14:09
 **/
public class Array3 {
    private int[] data;
    private int n=0;
    private int count=0;

    public Array3(int capality) {
        this.data = data;
        this.n = capality;
        this.count = capality;
    }

    public boolean insertByIndex(int index,int value){

        if(index<0||index>count)return false;
        if (count==n)return false;

        for (int i=index+1;i<count;++i){
            data[i+1]=data[i];
        }
        data[index]=value;
        ++count;
        return true;
    }
}
