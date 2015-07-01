package assignment_3;

import java.util.Scanner;

public class fibonacciPrint {

	public static void main(String[] args) {

		int f0=0,f1=1,f2=1;
		// Read the input from User i.e Number to which fibonacci needs to get printed
		System.out.println("This program outputs the first N\nnumbers in the Fibonacci sequence\nEnter N:");
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		if(n>2)
		{
			System.out.print("The first "+n+" numbers in the Fibannoci\nsequence are as follows:\n"+f0+" "+f1+" "+f2+" ");
			// iterate the loop till n-1 values and print the values
			for(int i=2;i<n-1;i++)
			{
				int f3 = f1+f2;
				System.out.print(f3+" ");
				f1=f2;f2=f3;
			}
		}
		else{
			System.out.println("Please enter the value grater than 2");
		}
		s.close();

	}

}
