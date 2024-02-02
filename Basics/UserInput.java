package Basics;
import java.util.Scanner;

public class UserInput{
    public static void main(String[] args) {
        System.out.println("Enter the two Numbers: ");
            Scanner read = new Scanner(System.in);
            int num1 = read.nextInt();
            int num2 = read.nextInt();
            int sum = num1 + num2;
        System.out.println("The sum of the given numbers is: "+sum);
    }
}
