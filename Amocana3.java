package com.company;

public class Amocana3 {

    int a;
    int b;

    public void rangeCalc() {
        int ax = a;
        int bx = b;
        if (b < a) {
            int c = ax;
            ax = bx;
            bx = c;
        }

        while (ax < b - 1) {
            ax = ax + 1;
            System.out.println(ax);
        }
    }

    public void divA() {
        int c = 1;
        while (c != a + 1) {
            if (a % c == 0) {
                System.out.println(c);
            } else {
                System.out.println("Try Again");
            }
            c++;
        }
    }

    public void divB() {
        int c = 1;
        while (c != b + 1) {
            if (b % c == 0) {
                while () {

                }
            }

        }
    }
}