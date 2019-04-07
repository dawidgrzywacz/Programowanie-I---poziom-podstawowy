package com.grzywacz.arrays;

public class Main {


    //int[] arr = new int[10];






    public static void main(String[] args) {

        System.out.println("Cwiczenia Arrays");

        int[] testArr = {1,2,3,4};
        MyArray ma = new MyArray();//tablica nieprzyspisana wartości, czyli same zera '0'
        MyArray ma2 = new MyArray(testArr);
        testArr[3] = 555;
        ma.print();
        ma2.print();

        System.out.println(testArr[3]);

        System.out.println("Wartość 3 jest na miejscu: " + ma2.find(3));

        System.out.println("Element na miejscu 8: " + ma.pick(8));


        ma2.find(3);
        ma2.pick(2);

        ma.push(17);
        ma.print();

        ma.pop();
        ma.print();
        //System.out.println(ma.pop());

        ma.insert();



    }
}


