package com.company;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        File myObj = new File("function.txt");
        if (myObj.createNewFile()) {
            System.out.println("File created: " + myObj.getName());
        } else {
            System.out.println("File creation failed!");
        }

        double x = 1.00;
        while ( x <= 2.00) {
            double y;
            y = x*x + 2*x + 3;
            System.out.println(y);
            x += 0.01;
        }
    }
}
