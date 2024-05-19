/*
Write a Java program to implement a simple calculator. The program should prompt the user to enter two numbers and an 
operator (+, -, *, or /) and then perform the corresponding operation and display the result.

For example, if the user enters 4, 5, and +, the program should display 9 as the result. Similarly, if the user enters 10, 3, 
and *, the program should display 30 as the result.

Your program should handle invalid inputs gracefully, for example, if the user enters an operator that is not one of the four 
allowed operators or if the user enters non-numeric inputs. 
*/

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter first digit");
                int a= sc.nextInt();
                System.out.println("Enter second digit");
                int b= sc.nextInt();
                System.out.println("Enter one the Character from +, -, *, /");
                char operator= sc.next().charAt(0);
                if(!(operator =='+' || operator== '-' || operator=='*' || operator =='/')){
                    System.out.println("enter valid operator");
                    return;
                }
                System.out.println(calculate(a, b, operator));
    }
    public static int calculate(int a, int b, char operator){
        switch (operator) {
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                return a/b;
            default:
                break;
        }
        return 0;
    }
}
