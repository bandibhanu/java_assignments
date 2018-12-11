package javaassignments;

import java.util.Scanner;

public class LinerSearch {
	public static void main(String args[])
	{
	 	int arr[]=new int[100];
		Scanner s=new Scanner(System.in);

		System.out.println("enter array length");
		int len=s.nextInt();

		System.out.println("enter array value");
		
	for(int i=0;i<len;i++)
	{
		arr[i]=s.nextInt();
	}
	
	System.out.println("enter searching element");
	int searchelement=s.nextInt();
	
	for(int j=0;j<len;j++)
	{ 
	
		
		if(searchelement==arr[j])
		{
		
	
			System.out.println("present in the array"+arr[j]);
		}
	}
	}
}
	