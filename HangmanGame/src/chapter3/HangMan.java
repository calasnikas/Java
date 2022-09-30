
package chapter3;

import java.util.Scanner;

public class HangMan {
    
    public void playGame(){
    
        System.out.println("playgame method is invoked");
    }
    
    public void instructGame(){
    System.out.println("instructGame method is invoked");
    }
    
    public void exitGame(){
    System.out.println("exitGane ");
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
     
     HangMan Hg= new HangMan();
     Hg.showMenu();
     
 }
    
    
}
