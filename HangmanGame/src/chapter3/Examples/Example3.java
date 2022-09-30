/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.Examples;

/**
 *generate the following
 * 1
 * 23
 * 456
 * 78910
 * 
 */
public class Example3 {
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++) {
            System.out.println("");
            for (int j = 1; j <=i; j++) {
                System.out.print(i);
               
            }
        }
    }
    
}
