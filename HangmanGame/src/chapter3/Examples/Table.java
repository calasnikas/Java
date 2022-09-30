/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.Examples;

import java.io.*;

/**
 *write a program to generate the table of a number;
 * 
 */
public class Table {
    public static void main(String[] args) throws IOException{
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        String s1;
        int n,table,i;
        System.out.println("Enter the number to generate the table");
        s1= br.readLine();
        n = Integer.parseInt(s1);
        System.out.println("Table of " +n);
        for ( i = 0; i <= 10; i++) {
            System.out.println(n+"*" +i+ " = "+(n*i));
        }
    }
}
