import java.util.Scanner;

public class Basic{

public static void inputOutput(){
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

public static void typeCasting(){
     Scanner input=new Scanner(System.in);
     //we can cast lower order data types to higher order but not higher order to lower order
     float num=input.nextInt();
    
     // type casting
    float  a=89.2f;
    int b= (int)(a);
    System.out.println(b);

    //from string to integer
    String s= "12345";
    int integer= Integer.parseInt(s);
    System.out.println(integer); //output: 12345

    //from integer to string, there are two ways to convert 
    int number = 123; 
    String str1 = String.valueOf(number);
    String str2 = number + "";
    System.out.println(str1); // Output: "123"
    System.out.println(str2); // Output: "123"

}
public static void main(String[] args){
    inputOutput();
    typeCasting();
}
}