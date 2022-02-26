package com.company.study.example.chapter5;

import java.util.Random;

public class FlowEx16 {

    public static void main(String[] args) {
        printStar();
        System.out.println();
        printStarUpgrade();
    }

    public static void printStar() {
        for (int i=0; i<50; i++) {
            if (i != 0 && i % 10 == 0) {
                System.out.println();
            }
            System.out.print("*");
        }

        Random random = new Random();
        random.nextInt();
    }

    public static void printStarUpgrade() {
        int j = 0;
        for (int i = 0; i < 100; i++) {
            if (i != 0 && i % 10 == 0) {
                System.out.println();
                j++;
            }

            if (i % 10 <= j) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
}
