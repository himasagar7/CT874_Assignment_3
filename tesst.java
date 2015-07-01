package assignment_3;

import java.util.Scanner;

public class tesst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;

	    while (i < 10){

	        i = i+3;
	        System.out.println("enter a number");
	        Scanner s = new Scanner(System.in);
			int n= s.nextInt();

	        System.out.println(i);
	        System.out.println(n);
	    }
	}

}
