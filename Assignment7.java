import java.util.Scanner;
public class Assignment7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] input = new int[100];
		int[] count = new int[100];
		int temp;
		System.out.println("Enter an interger between 1 and 100:" );
		//get the input from user and save it in the array
		for(int i = 0; i < input.length; i++)
		{
		input[i] = scan.nextInt();
		// condition to stop the entry from the user
		if(input[i] == 0)
		{
		break;	
		}				
		}
		
		//count the occurance of each number
		for(int i = 0; i<input.length; i ++) {
		temp = input[i];
		count[temp]++;				
		}
		
		//print the number of occurance
		for(int i = 1; i<count.length; i++)
		{
			if(count[i] > 0 && count[i] == 1){
		         System.out.printf("%d occurs %d time\n",i, count[i]);
		         }
		        else if(count[i] >=2){
		            System.out.printf("%d occurs %d times\n",i, count[i]);
		        }
		}
	}

}
