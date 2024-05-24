import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(0);
        System.out.println(1);
        int a=0;
        int b=1;
        for(int i=0;i<n-2;i++){
            int sum= a+b;
            System.out.println(sum);
            a=b;
            b=sum;
        }
        
    }
}