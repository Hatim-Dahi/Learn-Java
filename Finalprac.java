import java.util.Arrays;
import java.util.Scanner;

public class Finalprac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] temp = s.split(" ");
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < temp.length; i++) {
            if (isPal(temp[i])) {
                count++;
                sb.append(temp[i]);
            }
        }
        System.out.println(sb.toString() + " " + count);
    }

    public static boolean isPal(String s) {
        if (s.length() == 1)
            return true;
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

}
