package labWork;

import java.util.Scanner;

// Java Program to Print Even Numbers from 1 to N using For loop

public class EvenNumber {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int number, i;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();	
		
		for(i = 1; i <= number; i++)
		{
			if(i % 2 == 0)
			{
				System.out.print(i +"\t"); 
			}
		}	
	}
}

