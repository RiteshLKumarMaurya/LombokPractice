package com.educator.Lombok3.day1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Class aClass=new Class();
        aClass.setClassId(new Random().nextInt());
        aClass.setClassName("JAVA DEVS");
        aClass.setClassTeacher("Ram Charan (South-indian)");

        System.out.println("Your teacher: \n"+aClass);
    }
}
