package com.bridgelabz.logicalproblems;

import java.util.Scanner;

public class ReverseNumber {

    static int REV = 0;
    static int REM= 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int num = sc.nextInt();

        while(num!=0){
             REM = num%10;
             num = num/10;
             REV =REV*10 + REM;

        }
        System.out.println("The reversed number is :" + REV);
    }
}
