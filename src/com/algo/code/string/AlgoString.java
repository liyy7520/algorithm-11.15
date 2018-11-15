package com.algo.code.string;

/**
 * @program: algo
 * @description:
 * @author: liyy
 * @create: 2018-10-30 16:07
 **/
public class AlgoString {


    public static void main(String[] args) {
        String str1 = new String();
        String str2 = "bubiryan";
        int length = str2.length();
        str2.substring(4,8);

        StringBuilder s3 = new StringBuilder(str2.substring(4,8));
        s3.append("bill");
        String s2New =s3.toString();
        char[] str2Char = str2.toCharArray();
        char c = str2.charAt(4);
        int r = str2.indexOf("r");


        System.out.println();
    }




}
