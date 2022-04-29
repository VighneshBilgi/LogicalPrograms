package com.bridgelabz.logicalproblems;

import java.util.Scanner;

public class PerfectNumber {
     static int SUM = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        System.out.print("The divisors of " + num + " are: ");

        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                if(SUM !=num) {
                    System.out.print(i + " ");
                    SUM = SUM + i;
                }
            }
        }

        System.out.println("\n");
        if (SUM == num){
            System.out.println(num + " is a Perfect number");
        } else {
            System.out.println(num + " is not a Perfect number");
        }
    }
}

