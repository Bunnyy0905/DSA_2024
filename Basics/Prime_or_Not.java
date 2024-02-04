//WAP to check whether the entered number is prime or not
import java.util.Scanner;

public class Prime_or_Not {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        int count=0;
        for(int i=1; i<=num; i++){
            if(num%i==0){
                count++;

            }
        }
        if(count==2) {  //As prime numbers are either divisible by 1 or by divisible by itself
            System.out.println(num + " is a prime number");
        }
        else{
            System.out.println(num + " is a composite number");
        }
    }
}
