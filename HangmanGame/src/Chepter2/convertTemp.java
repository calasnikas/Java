package Chepter2;

import java.util.Scanner;

public class convertTemp {

    public static void main(String []args){
    
        int c;
        int f;        
        Scanner sc = new Scanner(System.in);
        System.out.println("temprature in celsius   =");
        c= sc.nextInt();
        
        f = c*9/5 + 32;
        System.out.println("temprature in farenheite ="+f);
    }
    
}
