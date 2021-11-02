package com.test;

import java.util.Scanner;

public class EnjoyRide {
	


	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Choose the ride \r\n"
					+ "1.Alibaba         $50         $40\r\n"
					+ "2.Alpine slide    $60         $30\r\n"
					+ "3.Bumpper Cars    $45         $25\r\n"
					+ "4.Baloon Race     $70         $60\r\n"
					+ "5.Exit");
			int n = sc.nextInt();
			if (n==5)
				System.exit(0);
		System.out.println("Enter the number of Adults");
		
		int a = sc.nextInt();
		System.out.println("Enter the number of children");
		int c = sc.nextInt();
		System.out.println("Enter the number of hours");
		int h = sc.nextInt();

		
		double t = Math.pow(2, h-1);
		double am;
		double cm;
		double tm;
		
		switch(n)
		{
		case 1:
		{
			 am = 50*a*t;
			 cm = 40*c*t;
			 tm = am+cm;
			System.out.println("Money from Adults " +am +"\nMoney from children  "+ cm+"\nTotal money  " + tm);
			break;
		}
		case 2:
		{
			 am = 60*a*t;
			 cm = 30*c*t;
			 tm = am+cm;
			System.out.println("Money from Adults " +am +"\nMoney from children  "+ cm+"\nTotal money  " + tm);
			break;
		}
		case 3:
		{
			 am = 45*a*t;
			 cm = 25*c*t;
			 tm = am+cm;
			System.out.println("Money from Adults " +am +"\nMoney from children  "+ cm+"\nTotal money  " + tm);
			break;
		}
		case 4:
		{
			 am = 70*a*t;
			 cm = 60*c*t;
			 tm = am+cm;
			System.out.println("Money from Adults " +am +"\nMoney from children  "+ cm+"\nTotal money  " + tm);
			break;
		}
		default :
			System.out.println("Enter a valid choice");
			
			
			
		
			

		}
		
		
		
		
	
	}

}
}