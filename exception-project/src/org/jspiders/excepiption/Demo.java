package org.jspiders.excepiption;

import java.util.Scanner;

public class Demo 
{

	public static void main(String[] args) 
	{

		while (true) 
		{
			System.out.println("main method started");
			Scanner sc= new Scanner(System.in);

			System.out.println("enter t first value");


			try 
			{
				int v1=sc.nextInt();
				System.out.println("enter second value");
				int v2=sc.nextInt();
				int r=v1+v2;
				System.out.println(r+"is the sum");

				int q=v1/v2;
				System.out.println(q+"is the coefficient");
			} catch (Exception e) 
			{

				if(e instanceof NumberFormatException)
				
					System.out.println("please enter only numbers");
					
				
				else
				
					System.out.println("enter v2 value greater than 0");
				
				
				continue;
				
				
			}
			

			break;

		}
		System.out.println("main method ended");
	}

}
