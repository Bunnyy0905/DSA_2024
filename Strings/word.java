// If the given word s has strictly more uppercase letters, make the word written in the uppercase, otherwise - in the lowercase one.
package Strings;
import java.util.Scanner;

public class word {
     public static void main(String[] args){
        System.out.println("Enter a String: ");
        Scanner read = new Scanner(System.in);
        String s = read.next();
        int upper = 0;
        int lower = 0;
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                upper++;
            } else {
                lower++;
            }
        }
            if (upper > lower) {
                System.out.println(s.toUpperCase());
            } else {
                System.out.println(s.toLowerCase());
            }
 
 
        }
    
}
