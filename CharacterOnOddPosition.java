/* Find the characters in odd position of a string which are consonent
 * 
 * Input: Arijit Ghosh
 * Output: hs
 */
import java.util.Scanner;

public class CharacterOnOddPosition {
    public static void main(String[] args) {
        // Vowels in both lowercase and uppercase
        String vowels = "aeiouAEIOU";
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close(); // Close the scanner to avoid resource leaks
        
        for (int i = 0; i < str.length(); i++) {
            // Check for odd position (1-based index means i+1)
            if (i % 2 == 0) {
                char ch = str.charAt(i);
                // Check if character is a consonant and not a space
                if (!vowels.contains(Character.toString(ch)) && Character.isLetter(ch)) {
                    System.out.print(ch);
                }
            }
        }
    }
}
