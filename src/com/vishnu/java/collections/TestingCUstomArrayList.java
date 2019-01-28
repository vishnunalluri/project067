package com.vishnu.java.collections;

public class TestingCUstomArrayList {

    public static void main(String[] args) {


        CustomArrayList customArrayList = new CustomArrayList();


        customArrayList.add(10);
        customArrayList.add(20);
        customArrayList.add(30);
        customArrayList.add(40);

        System.out.println(customArrayList);

        //customArrayList.removeL1(20);

        //System.out.println(customArrayList);

        customArrayList.removeL2(30);

        System.out.println(customArrayList);
    }
}
