import java.util.Scanner;

public class ArmstongNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int sum=0;
        int k=num;
        while(num>0){
            int rem= num%10;
            sum+=rem*rem*rem;
            num=num/10;
        }
        if(sum==k){
            System.out.println("yes");
        }else{
            System.out.println("NO");
        }
    }
}
