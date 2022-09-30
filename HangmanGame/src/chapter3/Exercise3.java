package chapter3;

import java.util.Scanner;

public class Exercise3 {
    
    public void result()
    {
       char Alphabet;
       System.out.println("Enter alphabet");
       Scanner sc= new Scanner(System.in);
       Alphabet = sc.next().charAt(0);
       
       
       switch (Alphabet){
       
           case 'a' :
               System.out.println("the alphabet is vowel");
               break;
               
           case 'e' :
               System.out.println("the alphabet is vowel");
               break;
               
           case 'i' :
               System.out.println("the alphabet is vowel");
               break;
               
           case 'o' :
               System.out.println("the alphabet is vowel");
               break;
               
           case 'u' :
               System.out.println("the alphabet is vowel");
               break;
               
           case 'A' :
               System.out.println("the alphabet is vowel");
               break;
               
           case 'E' :
               System.out.println("the alphabet is vowel");
               break;
               
           case 'I' :
               System.out.println("the alphabet is vowel");
               break;
               
           case 'O' :
               System.out.println("the alphabet is vowel");
               break;
               
           case 'U' :
               System.out.println("the alphabe is vowel");
               break;
               
           default :
               System.out.println("the alphabet is consonent");
                
       }
    }
        public static void main(String []args){
            
            Exercise3 ex3= new Exercise3();
            ex3.result();
        }       
    
    
}
