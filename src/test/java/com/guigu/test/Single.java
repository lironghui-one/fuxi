package com.guigu.test;

//public class Single {
//    private static final Single INSTANCE = new Single();
//
//    private Single(){}
//
//    public static Single getInstance(){
//        return  INSTANCE;
//    }
//}

public class Single{
    private Single(){}

    private static class Inner{
        static final Single INSTANCE = new Single();
    }

    public static Single getInstance(){
        return Inner.INSTANCE;
    }
}
