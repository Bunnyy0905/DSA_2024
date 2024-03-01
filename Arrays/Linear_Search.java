//WAP to find an element in an array using Linear Search
import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number of elements to be inserted in the array: ");
        int size = read.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[size];
        for (int j = 0; j <size ; j++) {
            arr[j] =  read.nextInt();
        }
        System.out.println("Enter the target element: ");
        int target = read.nextInt();
        int ans = LinearSearch(arr, size, target);  //Calling the function in main function
        System.out.println(target + " is found at index: " + ans);

    }
    static int LinearSearch(int arr[], int size, int target){
        for (int i = 0; i < size; i++) {
            if (arr[i]== target) {
                return i;
            }
        }
        return -1;
    }
}


