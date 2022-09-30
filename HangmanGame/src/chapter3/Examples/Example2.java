/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.Examples;

/**
 * to generate the following 
 * 1 
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 *
 */
public class Example2 {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println(" ");
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print("1");
                } else if (j == 2) {
                    System.out.print("2");
                } else if (j == 3) {
                    System.out.print("3");
                } else if (j == 4) {
                    System.out.print("4");
                } else if (j == 5) {
                    System.out.print("5");
                } else if (j == 6) {
                    System.out.print("6");
                } else if (j == 7) {
                    System.out.print("7");
                } else if (j == 8) {
                    System.out.print("8");
                } else if (j == 9) {
                    System.out.print("9");
                }
            }
        }
    }
}
