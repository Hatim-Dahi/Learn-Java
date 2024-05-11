import java.util.Scanner;

public class Basic{
public static void main(String[] args){
    //to print something on command line
    //System is a class and println means add a new line
    System.out.println("Basics of JAVA");
    //to take input we need Scanner class from java util package
    //system.in means take input from command line arguments
    Scanner input=new Scanner(System.in);
    System.out.println(input.nextInt());
    //for single word string
    System.out.println(input.next());
    //for complete sentence of string
    System.out.println(input.nextLine());
    System.out.println(input.nextDouble());
    System.out.println(input.next());
}
}