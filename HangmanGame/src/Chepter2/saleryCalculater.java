package Chepter2;

import java.util.Scanner;

public class saleryCalculater {
    
    public static void main(String []args){
    
        int basicsalary;
        int hra;
        int specialallowance;
        int pf;
        int netpayablesalary;
       
        
        System.out.println("Enter your basic salary :");
        Scanner sc= new Scanner(System.in);
        basicsalary=sc.nextInt();
        
        hra=(50*basicsalary)/100;
        specialallowance=(75*basicsalary)/100;
        pf=(12*basicsalary)/100;
        netpayablesalary=basicsalary+hra+specialallowance-pf;
        
        System.out.println("Basic Salary       ="+basicsalary);
        System.out.println("HRA                ="+hra);
        System.out.println("Special allowance  ="+specialallowance);
        System.out.println("PF                 ="+pf);
        System.out.println("-----------------------");
        System.out.println("Net palyable salary="+netpayablesalary);
    }
    
    
}
