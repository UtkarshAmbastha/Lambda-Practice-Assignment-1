package com.knoldus;

public class MaxOfTwoNumbers {
    public static void main(String[] args) {

       MaxNumbers maxNumbers = ((num1, num2) -> (num1 > num2) ? num1 : (num1 < num2) ? num2 : 0);

        int max = maxNumbers.findMax(3,12);
        System.out.println(max);
    }
}
