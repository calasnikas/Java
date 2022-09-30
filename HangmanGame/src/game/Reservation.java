package game;

import java.util.Scanner;
public class Reservation {
    public void showTicket(){
    int TicketID;
    Scanner sc = new Scanner(System.in);
    System.out.println("");
    TicketID= sc.nextInt();
    }
    public static void main(String []args){
    Reservation R= new Reservation();
    R.showTicket();
    }
}
