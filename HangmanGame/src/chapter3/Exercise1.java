package chapter3;

import java.util.Scanner;


public class Exercise1{
   
    public void enterData(){
    System.out.println("enter data is invoked");
    }
    public void displayData(){
    System.out.println("display data is invoked");
    }
    public void exitMenu(){
    System.out.println("exit menu is invoked");
    }
    
    public void showMenu(){
    
        int option;
        Scanner sc = new Scanner(System.in);
        System.out.println("-------Menu------");
        System.out.println("1. Enter Data");
        System.out.println("2. Update Data");
        System.out.println("3. Display Data");
        System.out.println("4. Exit");
        System.out.println("\nChoose the Option");
        option= sc.nextInt();
        
    switch(option)
    {
        case 1: enterData();
               break;
        case 2: displayData();
               break;
        case 3: exitMenu();
               break;
        
    }
    }
  public static void main(String []args){
  
      Exercise1 ex= new Exercise1();
      ex.showMenu();
  }     
    
}
