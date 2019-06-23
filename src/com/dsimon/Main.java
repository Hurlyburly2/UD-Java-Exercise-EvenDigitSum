package com.dsimon;

public class Main {

    public static void main(String[] args) {
        System.out.println(EvenDigitSum.getEvenDigitSum(123456789) == 20);
        System.out.println(EvenDigitSum.getEvenDigitSum(252) == 4);
        System.out.println(EvenDigitSum.getEvenDigitSum(-22) == -1);
    }
}
