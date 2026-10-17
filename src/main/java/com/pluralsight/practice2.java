package com.pluralsight;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("enter first number ");
        int number= myScanner.nextInt();
        System.out.println("enter secound number ");
        int sNumber= myScanner.nextInt();
        int result = isMin(number,sNumber);
        myScanner.nextLine();
        System.out.println("the minmum number is " + result);
        boolean isminResult = isGreater(number, sNumber);
        System.out.println("the result is also postive " + isminResult);



    } public static int isMin(int number, int snumber) {
        return Math.min(number,snumber);
    } public static boolean isGreater(int number, int snumber) {
        return isMin(number, snumber) > 0;
    }
}
