package ch12.sec05;

import java.util.ArrayList;
import java.util.Arrays;

public class ByteToStringExample {
    public static void main(String[] args) {
        String data = "자바";

        //String  -> byte배열
        byte[] arr1 =data.getBytes();
        System.out.println("arr1: "+ Arrays.toString(arr1));
        //byte -> String
        String str1 = new String(arr1);
        System.out.println("str1: "+str1);
    }
}
