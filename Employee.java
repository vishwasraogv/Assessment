package com.test;

import java.util.Scanner;

public class Employee {
	static int e_id = 112;
	String e_name = "Ramesh";
	static double b_salary;
	static double sa;
	static double hra;
	static double ta;
	static double tax = 2500;
	
	
	public static void NetSalary(double b_salary,double sa,double hra,double ta,double tax)
	{
		double net_sal = b_salary+hra+sa+ta-tax;
		System.out.println("Net salary is " + net_sal);
	}
	
	
	
	public static void main(String args[])
	{
		Employee e1 = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the basic salary");
		e1.b_salary= sc.nextInt();
		if(e1.b_salary<=10000)
		{
			e1.hra = 0.2*e1.b_salary;
			e1.sa = 0.8*e1.b_salary;
		}
		else if (e1.b_salary<20000 && e1.b_salary>10000)
		{
			e1.hra = 0.25*e1.b_salary;
			e1.sa = 0.9*e1.b_salary;
		}
		else
		{
			e1.hra = 0.3*b_salary;
			e1.sa = 0.95*b_salary;
			
		}
		e1.ta = 0.2*b_salary;
		System.out.println("Employee name " + e1.e_name + "  \nID " + e1.e_id);
		NetSalary(e1.b_salary,e1.sa,e1.hra,e1.ta,e1.tax);
		
		
	}

}
