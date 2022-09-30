package Chepter2;

import java.util.Scanner;

public class calculate {

    public static void main(String []args){
    
        int u;
        int a;
        int t;
        int distance;
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("the initial velocity =");
        u= sc.nextInt();
        System.out.println("the acceleration     =");
        a= sc.nextInt();
        System.out.println("the time             =");      
        t= sc.nextInt();
        
        distance= u*t + (a*t*t)/2;
        
        
        System.out.println("-------------------------");
        System.out.println("travelled distance   ="+distance);
        
    }
    
}
