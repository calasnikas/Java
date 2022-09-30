/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.Examples;

/**
 *to generate the following.
 * 1
 * 212
 * 32123
 * 4321234
 * 543212345
 * 
 */
public class Example1 {
   
    public static void main(String[] args) {
        
        for(int i= 1; i<=5;i++){
            System.out.println(" ");
           
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
        }
    }
    
}
