package com.test;

import java.util.HashMap;
import java.util.Scanner;

public class FlowerDemo1 {
	public static void displayFlower(String cont)
	{
		
		HashMap<String, String> Asia = new HashMap<String, String>();
		HashMap<String, String> Europe = new HashMap<String, String>();
		HashMap<String, String> Africa = new HashMap<String, String>();
		Asia.put("INDIA", "LOTUS");
		Asia.put("PAKISTAN", "JASMINE");
		Asia.put("NEPAL", "LALI GURANS");
		
		Europe.put("GERMANY", "CORN FLOWER");
		Europe.put("FRANCE", "LILY");
		Europe.put("GREECE", "ACANTHUS MOLLIS");
		
		Africa.put("EGYPT", "BLUE LOTUS");
		Africa.put("NIGERIA", "YELLOW TRUMPET" );
		Africa.put("KENYA", "ORCHID");
		
		if (cont.equals(("ASIA")))
		{
			for (String i : Asia.keySet()) 
			      System.out.println("Country: " + i + " Flower: " + Asia.get(i));
		}
			
			else if (cont.equals("EUROPE"))
			{
				for (String i : Europe.keySet()) 
				      System.out.println("Country: " + i + " Flower: " + Europe.get(i));
			}
				else if (cont.equals("AFRICA"))
				{
					for (String i : Africa.keySet()) 
					      System.out.println("Country: " + i + " Flower: " + Africa.get(i));
				}
				else
				{
					System.out.println("Please enter an appropriate value");
				}
	}
	public static void main(String args[])
	{
		System.out.println("The list of Continents");
		System.out.println("1.ASIA");
		System.out.println("2.EUROPE");
		System.out.println("3.AFRICA");
		System.out.println("ENTER the name of the continent in caps");
		
		Scanner sc = new Scanner(System.in);
		String choice = sc.next();
		displayFlower(choice);
	}


}
