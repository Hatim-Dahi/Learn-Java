import java.util.*;

public class ArrayArrayList{
    public static void integerArray(){
         //syntax to create an array 
       int[] arr= new int[10];
       for(int i=0;i<10;i++){
        arr[i]=i;
       }
       //one to print the array
       for(int i=0;i<10;i++){
        System.out.println(arr[i]+ " ");
       }
       //another simple way to print
       System.out.println(Arrays.toString(arr));
    }
    public static void stringArray(){
        String[] str= new String[5];
        Scanner sc= new Scanner(System.in);
         for(int i=0;i<5;i++){
            str[i]= sc.next();
       }
       System.out.println(Arrays.toString(str));
       //to manipulate the array
       str[2]= "hatim";
       System.out.println(Arrays.toString(str));
    }
    
    public static void twoDimensionalArray(){
        int[][] arr= new int[3][3];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    public static void main(String[] args) {
    //    integerArray();
    //    stringArray();
    twoDimensionalArray();
    }
}