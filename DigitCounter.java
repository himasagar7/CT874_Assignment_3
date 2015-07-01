package assignment_3;

import java.util.Scanner;

//The program counts the number of digits in an integer entered by the user
public class DigitCounter {

	public static void main(String[] args) {

		// To read the text input from User
		Scanner s = new Scanner(System.in);
		// Integer To hold the input given by user
		int number;
		// Temporary storing of the variable
		int num;
		//To store the count i.e number of digits in the integer
		int count;
		
		//To continuously run the program until user wants to terminate
		boolean flag= true;
		
		System.out.println("The program counts the number of digits\nin an integer entered by the user");
		
		while(flag)
		{
			System.out.print("Enter -1 to exit\n\nEnter Number:");
			
			 number = s.nextInt();
			 num =  number;
			if(num!=-1)
			{
				
				for (count=0;num>0;num=num/10){
					count++;
				}
				System.out.println("Number of digits in "+number+" is "+count);
			}

			else{
				System.out.println("Program Terminated ...");
				flag=false;
				
			}

		}

		s.close();
	}


}
