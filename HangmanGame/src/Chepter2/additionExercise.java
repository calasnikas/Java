
package Chepter2;

import java.util.Scanner;

public class additionExercise {
    
    public static void main(String []args){
    
        int a = 5;
        int result;
        
        result= a++;
        System.out.println("the result is ="+result);//
        
        //prefix value- In prefix form the value is incremented or decrement before it is assigned to the operator.
        
//        ++result;
        System.out.println("the result is ="+(++result));
        
        //posfix Fprm - in this form the value is incremented or decremented after it has assigned to the operator.
//        result++;
        System.out.println("the result is ="+(result++));
                     
        
    }
    
}
