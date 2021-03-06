package com.company.study.example.chapter5;

import java.util.Scanner;

public class MultiArrEx1 {

    public static void main(String[] args) {
        final int SIZE = 10;
        int x = 0, y = 0;

        char[][] board = new char[SIZE][SIZE];
        byte[][] shipBoard = {
                {0, 0, 0, 0, 0, 0, 1, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 1, 1, 0}
        };

        for (int i =1; i<SIZE; i++) {
            board[0][i] = board[i][0] = (char) (i + '0');
        }

        for (int i=0; i<SIZE; i++) {
            for (int j=0; j<SIZE; j++) {
                board[i][j] = '0';
            }
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("력");
            String input = scanner.nextLine();

            if (input.length() == 2) {
                x = input.charAt(0) - '0';
                y = input.charAt(1) - '0';
                if (x==0 && y==0) {
                    break;
                }
            }

            if (input.length() != 2 || x <= 0 || x >= SIZE || y <= 0 || y >= SIZE) {
                System.out.println("입력");
                continue;
            }

            board[x][y] = shipBoard[x-1][y-1] != 1 ? 'A' : 'X';

            for (int i =0; i < SIZE; i++) {
                System.out.println(board[i]);
            }
            System.out.println();
        }
        System.out.println('\0');
    }
}
