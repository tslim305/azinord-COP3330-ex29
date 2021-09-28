package com.company;

import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        {
            // your code goes here
            Scanner scan = new Scanner(System.in);
            int val;
            while (true) {
                System.out.print("What is the rate of return? ");
                val = Integer.parseInt(scan.next());

                //System.out.println(val);
                if (val >= 1 && val <= 72) {
                    System.out.println("it will take " + (72 / val) + " year to double your initial investment");
                    break;
                } else {
                    System.out.println("Sorry this is not a valid input");
                }
            }
        }
    }
}
