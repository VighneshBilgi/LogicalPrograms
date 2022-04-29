package com.bridgelabz.logicalproblems;

import java.util.Scanner;

public class PrimeNumber {

    static int COUNT = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                COUNT++;
                }
            }

        if (COUNT == 2){
            System.out.println(num + " is a Prime number");
        } else {
            System.out.println(num + " is not a Prime number");
        }

    }
}

