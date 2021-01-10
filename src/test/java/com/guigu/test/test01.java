package com.guigu.test;

import org.junit.Test;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class test01 {
    @Test
    public void test1(){
        byte a = 0;
        short b = 0;
        int c = 4;
        long d = 0;
        double e = 0.0;
        float f = 0f;
        char g = 'a';
        boolean h = false;
    }

    @Test
    public void test2(){
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        char c = scanner.next().charAt(0);
    }

    @Test
    public void test3(){
        int month = 4;
        switch (month){
            case 4:
                System.out.println("这是4月");
                break;
            default:
                System.out.println("输入有误");
        }
    }

    @Test
    public void test4(){
        for (int i =1;i<=100;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }

    @Test
    public void test5(){
        int[] arr = {4,5,9,3,6,9,0};
        int max = arr[0];
        for (int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
        for (int i=0;i<arr.length;i++){
            if(arr[i]==9){
                System.out.println("最大值在数组第"+(i+1)+"位");
            }
        }

        int[] newArr = new int[arr.length];
        for (int i=0;i<newArr.length;i++){
            newArr[i] = arr[arr.length-1-i];
        }
        arr = newArr;
        for(int i:arr){
            System.out.print(i+"  ");
        }

        int[] arr1 = new int[arr.length-1];
        for(int i=0;i<arr1.length;i++){
            arr1[i] = arr[i];
        }
        arr = arr1;
        for (int i:arr){
            System.out.print(i+"  ");
        }
    }

    @Test
    public void test6() {
        int[] arr = {6, 5, 2, 3, 8, 9, 52, 2, 4, 3};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + ",  ");
        }

        int index = -1;
        int left = 0;
        int right = arr.length-1;
        int mind = (left+right)/2;
        int value = 6;
        while (left<=right){
            if(arr[mind]==value){
                index = mind;
                break;
            }
            if(value<arr[mind]){
                right = mind-1;
                mind = (right+left)/2;
            }
            if(value>arr[mind]){
                left = mind+1;
                mind = (right+left)/2;
            }
        }
        if(index==-1){
            System.out.println("没有找到");
        }
        System.out.println(value+"在第"+(index+1)+"位");
    }

    @Test
    public void test7() {
        // private 缺省的 protected public
        // p instanceof people
        // abstract
    }

    @Test
    public void test8(){
        int a = 10;
        String str = a+"";
        String str1 = String.valueOf(a);

        int i = Integer.parseInt(str);

        Character.toLowerCase('X');

        List<Object> list = new ArrayList<Object>();
        String str2 = "";
        int[] arr = new int[5];
        for (int g=0;g<5;g++){
            arr[g] = (int) (Math.random()*100)+1;
        }
        //int[] arr = {1,2,3,8,56,5,3,9};
        //for (int d=0;d<arr.length;d++){
        //    if(d != arr.length-1){
        //        str2 += arr[d];
        //        str2 += ",";
        //    }else {
        //        str2 += arr[d];
        //    }
        //}
        for (int d:arr){
            str2 += d;
            str2 += ",";
        }
        String s1 = str2.replaceAll("3", "555");

        String[] split = s1.split(",");
        for (String s:split){
            list.add(s);
        }

        for(int c=0;c<list.size();c++){
            System.out.print(list.get(c)+" ");
        }
    }

    @Test
    public void test9(){
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String s = sf.format(date);
        System.out.println(s);
    }

    @Test
    public void test10(){
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<5;i++){
            list.add((int) (Math.random()*100+1));
        }

        Object[] objects = list.toArray();
        for (Object o :objects){
            System.out.print(o+" ");
        }
        System.out.println();

        String string = list.toString();
        System.out.println(string);

        int[] arr = new int[list.size()];
        for (int i=0;i<list.size();i++){
            arr[i] = list.get(i);
        }
    }

    @Test
    public void test11(File src,File dest)throws IOException{

            FileInputStream fileInputStream = new FileInputStream(src);
            FileOutputStream fileOutputStream = new FileOutputStream(dest);

            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);


            byte[] bytes = new byte[1024];
            while (true) {
                int len = bufferedInputStream.read(bytes);
                if (len == -1) {
                    break;
                }
                bufferedOutputStream.write(bytes, 0, len);
            }

            bufferedInputStream.close();
            bufferedOutputStream.close();
            fileInputStream.close();
            fileOutputStream.close();
    }



    @Test
    public void test12(){
        String str = "asdhfng654df4,fjgfd";
        char[] chars = str.toCharArray();

        Map<Character, Integer> newMap = new HashMap<Character,Integer>();
        for(int i=0;i<chars.length;i++){
            if(newMap.get(chars[i])==null) {
                int num = 1;
                newMap.put(chars[i], num);
            }else {
                 int o = newMap.get(chars[i]);
                 o++;
                 newMap.put(chars[i],o);
            }
        }

        for(Object s:newMap.keySet()){
            System.out.println("key : "+s+" value : "+newMap.get(s));
        }
    }
}

