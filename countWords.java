import java.util.HashMap;
import java.util.Scanner;

public class countWords {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        String k=sc.nextLine();  
        String[] temp= s.split(" ");
        int count=0;
        for(int i=0;i<temp.length;i++){
            if(temp[i].equals(k)){
                count++;
            }
            System.out.println(temp[i]);
        }
        System.out.println("count is: "+count);
    }
}
