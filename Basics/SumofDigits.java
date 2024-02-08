//Write a program to calculate the sum of all the digits of N.
import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        int sum = 0;
        while(num!=0){
            int remainder = num%10;
            sum = sum+remainder;    //It will store the total sum of digits
            num = num/10;
        }
        System.out.println("The sum of the digits is: "+sum);
    }
}
