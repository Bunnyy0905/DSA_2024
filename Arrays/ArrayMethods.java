//Taking a list of elements in an array and sorting the array in ascending order
import java.util.*;

public class ArrayMethods {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements you want to put in the array: ");
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] num = new int[n];
        for(int i =0; i<n; i++){
            num[i] = read.nextInt();
        }
        Arrays.sort(num);   //Sorting the array in Ascending Order
        for(int j=0; j<n; j++) {
            System.out.println(num[j]);
        }
    }

}
