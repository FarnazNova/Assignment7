package chapter7;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;

public class ClassExercise7 {

	public static void main(String[] args) throws Exception{
		int count=0;
		int sum = 0;
		int[] num = new int[100];
		File file = new File("final.txt");
		Scanner input = new Scanner(System.in);
		Scanner scan = new Scanner(file);
		System.out.print("Her are the numbers in the file: ");
		if(file.exists())
		{
			//Read data from a file
			while(scan.hasNext())
			{				
				// store in the array				
				num[count] = scan.nextInt();
				System.out.print(num[count] + "   " );
				
				// Sum of the integers in the file
				sum += num[count];
				count++;			
			}
			double average = sum / count;
			System.out.println();
			System.out.println("The sum of all numbers in the file = " + sum);
			System.out.println("The average of all numbers in the file = " + average);
			}

		 //	Close the file
			scan.close();
		}		
	}


