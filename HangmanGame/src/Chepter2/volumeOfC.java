package Chepter2;

import java.util.Scanner;

public class volumeOfC {

    public static void main(String []args){
    
        int r;
        int h;
        int volume;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("the radius  =");
        r= sc.nextInt();
        System.out.println("the height  =");
        h= sc.nextInt();
        
        volume = 22/7*r*r*h;
        System.out.println("the volume  ="+volume);
    }
    
}
