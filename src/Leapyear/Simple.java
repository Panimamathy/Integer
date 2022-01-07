package Leapyear;

import java.util.Scanner;

public class Simple {
	
	public static void main(String args[])
	{
		System.out.println("Enter a year");
		Scanner scan = new Scanner(System.in);
		int Scanner = scan.nextInt();
		if(Scanner % 4 == 0 && Scanner%400==0) 
	
		{
			System.out.println("The year is leap year");
		}
		
		else 
		{
			System.out.println("The year is not aleap year");
		}
	}

	
	
	
	
	
	
}
