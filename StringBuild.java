import java.util.Arrays;

public class StringBuild {
    public static void main(String[] args) {
        //StringBuilder is typically used over String when you need to perform a lot of modifications to a string. 
        StringBuilder str= new StringBuilder("hello");
        System.out.println(str);
        str.append(" ");
        str.append("world");
        System.out.println(str);
        str.reverse();
        System.out.println(str.length());
        System.out.println(str.delete(1, 4));
    }
}
