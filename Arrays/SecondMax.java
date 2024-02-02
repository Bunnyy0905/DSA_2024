//Finding the Second Maximum number in an array
import java.util.*;


public class SecondMax
{
	public static void main (String[] args)
	{	
		Scanner read = new Scanner(System.in);
		    int[] num = new int[3];
		    for(int j=0; j<3; j++){
		        num[j] = read.nextInt();
		    }
		Arrays.sort(num);   //Sorting the array in Ascending Order
		System.out.println(num[1]); 

		
	
	}
}
