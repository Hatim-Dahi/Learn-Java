/*Count the number of words in a sentence that contain at least two consecutive vowels (a, e, i, o, u) in them.
Here's a sample input and output:

Input: I enjoy eating spaghetti and meatballs for dinner
Output: 2

Explanation: There are two words in the sentence that contain at least two consecutive vowels - "enjoy" and "meatballs".
 */

import java.util.Scanner;

public class ConsecutiveVowel {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        boolean flag= true;
        int ans=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                flag=true;
            }
            else if(check(str.charAt(i))){
                if(i>0 && check(str.charAt(i-1)) && flag){
                    ans++;
                    flag=false;
                }
            }
        }
        System.out.println("Number of words with consecutive vowels are:" +ans);
    }
    public static boolean check(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return true;
        }else{
            return false;
        }
    }
}
