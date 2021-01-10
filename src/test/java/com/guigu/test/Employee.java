package com.guigu.test;


//public class Employee implements Comparable {
//    private int age;
//    public int compareTo(Object o) {
//        return age - ((Employee)o).getAge();
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public int getAge() {
//        return age;
//    }
//}


import java.util.Comparator;

class Employee implements Comparator{
    private int age;
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee)o1;
        Employee e2 = (Employee)o2;
        if(e1.getAge()>e2.getAge()){
            return 1;
        }else if(
                e1.getAge()<e2.getAge()
        ){
            return -1;
        }
        return 0;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}