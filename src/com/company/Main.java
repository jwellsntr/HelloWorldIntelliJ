// Author: John Wells
// Date: 8-18-2019
// Title: Hello Wolrd
// IDE: Intellij
//
// Intellij was used to create the standard, world-famour Hello World Program

package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int number;
        for(int i=1;i<=40;i++) {
            System.out.println("Hello World! " + i);
            for(int c=1;c<=2;c++) {
                System.out.println("  Jen was here! " + c);
            }
        }

        number = incrementNumber(33);
        System.out.println("In main, I present to you 33 + 12 = " + number);
    }

    private static int incrementNumber(int number) {
        System.out.println("the number in: " + number);
        number = number + 12;
        return (number);
    }

}
