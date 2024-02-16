import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int reverse_number = 0;
        while(n>0){
            int remainder = n%10;
            reverse_number = reverse_number*10+remainder;
            n = n/10;

        }
        System.out.println(reverse_number);

    }
} {
    
}
