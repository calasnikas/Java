package chapter3;

import java.util.Scanner;

public class Exercise2 {

    public void result() {

        int num;
        int i;
        System.out.println("Enter the number =");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        Exercise2 ex2 = new Exercise2();
        ex2.result();
    }
}
