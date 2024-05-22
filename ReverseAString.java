import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        StringBuilder sb= new StringBuilder(str);
        int i=0,j=str.length()-1;
        while(i<j){
            char temp= sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            j--;
            i++;
        }
        System.out.println(sb);           
    }
}
