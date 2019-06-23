package com.dsimon;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int evenDigitSum = 0;
        while (number > 0) {
            int currentDigit = number % 10;
            if (currentDigit % 2 == 0) {
                evenDigitSum += currentDigit;
            }
            number /= 10;
        }
        return evenDigitSum;
    }
}
