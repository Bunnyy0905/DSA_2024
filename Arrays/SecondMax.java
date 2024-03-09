//Finding the Second Maximum number in an array
import java.util.*;

public class SecondMax
{
	public static void main (String[] args)
	{			
		System.out.println("Enter the number of elements you want to put in the array: ");
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		System.out.println("Enter the elements of the array: ");
		    int[] num = new int[n];
		    for(int j=0; j<n; j++){
		        num[j] = read.nextInt();
		    }
		Arrays.sort(num);   //Sorting the array in Ascending Order
		System.out.println("The second highest number is: "+num[1]); 

		
	
	}
}
