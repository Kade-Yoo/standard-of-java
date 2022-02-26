package com.company.share.example;

import java.util.Scanner;

public class Share_20220206 {

    public static <TheType extends Comparable<TheType>> int checkOrder(TheType item1, TheType item2, TheType item3, TheType item4) {
        int output;

        if (item1.compareTo(item2) < 0 && item2.compareTo(item3) < 0 && item3.compareTo(item4) < 0) {
            output = -1;
        } else if (item2.compareTo(item1) < 0 && item3.compareTo(item2) < 0 && item4.compareTo(item3) < 0) {
            output = 1;
        } else {
            output = 0;
        }

        return output;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("checkOrder : " + checkOrder(scanner.next(), scanner.next(), scanner.next(), scanner.next()));
        System.out.println("checkOrderDouble : " + checkOrder(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble()));
    }

    public class Pair <TheType extends Comparable<TheType>> {
        private TheType firstVal;
        private TheType secondVal;

        public Pair(TheType aVal, TheType bVal) {
            this.firstVal = aVal;
            this.secondVal = bVal;
        }

        // 추가 코드
        public TheType getFirstVal() {
            return this.firstVal;
        }

        // 변경 코드
        public int compareTo(Pair<TheType> otherPair) {
            if (this.firstVal.compareTo(otherPair.getFirstVal()) < 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
