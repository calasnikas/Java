
package game;

import java.util.Scanner;
public class Hangman {
    
   
    
    public void showMenu(){
    
        int option;
        Scanner sc = new Scanner(System.in);
        System.out.println("-----MEnu-----");
        System.out.println("1. Play");
        System.out.println("2. Instruction");
        System.out.println("3. Exit");
        System.out.println("\nChoose the option");
        option = sc.nextInt();
    }
  
 public static void main (String []args){
     
     Hangman Hg= new Hangman();
     
   Menu mobj = new Menu();
    mobj.addComponent();
     
     
   // GameWindow gobj = new GameWindow();
    //gobj.addComponent();
 }
    
    
}
