
package chapter3;

import java.util.Scanner;

public class activity3_2 {
    
    public void playGame(){
        String word ="austrailia";
        int i,flag=0;
        String input, guess;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("\nEnter Your Guess: ");
            input = sc.nextLine();
            
            for(i=0;i<word.length();i++)
            {
                if(word.charAt(i) == input.charAt(0))
                {
                    flag=1;
                }
            }
            if(flag==1)
            {
                System.out.println("This letter is presented in the word");
            }
            else
            {
                System.out.println("This letter is not presented in the word");
            }
            System.out.println("Do want to guess agail(y/n):");
            guess = sc.nextLine();
            
        }while(guess.equals("Y")||guess.equals("Y"));
    
        }
    
    public void instructGame(){
    System.out.println("instructGame method is invoked");
    }
    
    public void exitGame(){
    System.out.println("exitGame ");
    }
    
    public void showMenu(){
    
        int option;
        Scanner sc = new Scanner(System.in);
        System.out.println("-----MEnu-----");
        System.out.println("1. Play");
        System.out.println("2. Instruction");
        System.out.println("3. Exit");
        System.out.println("\nChoose the option");
        option = sc.nextInt();
    switch(option){
    
        case 1: playGame();
               break;
        case 2: instructGame();
               break;
        case 3: exitGame();
               break;
    }
    }
  
 public static void main (String []args){
     
     activity3_2 ac = new activity3_2();
     ac.showMenu();  
 }
}
