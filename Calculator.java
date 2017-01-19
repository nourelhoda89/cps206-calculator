//**************************************************************
//Program: Simple calculator
//Date:  1/18/2017
//Author: Nourelhoda Farhat 
//**************************************************************
import java.util.Scanner;

public class Calculator{ 

   public static void main(String[] args){
      double num1 = 0.0,
             num2 = 0.0,
             answer = 0.0;
       
      Scanner keyboard = new Scanner(System.in); 
    
   
      System.out.println("Please enter a number :");
      num1 = keyboard.nextDouble();
    
      System.out.println("Please enter another number :");
      num2 = keyboard.nextDouble();
      
      keyboard.nextLine();
      
   
      System.out.println("What operation would you like to performe : add (+) ," +
                           " substract (-),multiply(*) or divide (/)");
      char operation = keyboard.nextLine().charAt(0);
      if (operation !='+' && operation != '-' && operation !='*'&& operation !='/')
    {
        System.out.println ("Please insert either +, -,*, /");
    }
      
      if (operation == '+'){
         answer =  num1 + num2;
         System.out.println (+ answer);
      }
      else if(operation == '-'){
         answer =  num1 - num2;
         System.out.println ( +answer);
      }
      else if (operation == '*'){
         answer = num1 * num2;
         System.out.println ( " +answer);
      }
      else if (operation == '/'){
         if (num2 == 0){
            System.out.println("You can't divide by zero");
         }
         else{
            answer = num2/num2;
            System.out.println ("java calculator divide " +answer);
         }
      }
      
     
   
   }
}




