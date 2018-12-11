package javaassignments;

import java.util.Scanner;

public class DateFormat {
	public static void main(String args[])
	{
         	Scanner s=new Scanner(System.in);
		System.out.println("enter the day");
		int day=s.nextInt();
		System.out.println("enter the month");
		int month=s.nextInt();
		System.out.println("enter the year");
		int year=s.nextInt();

if(day<31&&month<12)
{
	displayformat(day,month,year);
}
	}
static void displayformat(int day,int month,int year)
{
	if(month==2)
	{
		if(day<29)
		{
			System.out.println(day+"/"+"february/"+year);
		}
		else
		{
			System.out.println("enter the valid day");
		}
	}
	else
	{
	switch(month)
	{
		case 1:
		System.out.println(day+"/"+"january/"+year);
		break;
		case 3:
		System.out.println(day+"/"+"march/"+year);
		break;
		case 4:
		System.out.println(day+"/"+"april/"+year);
		break;
		case 5:
		System.out.println(day+"/"+"may/"+year);
		break;
		case 6:
		System.out.println(day+"/"+"june/"+year);
		break;
		case 7:
		System.out.println(day+"/"+"july/"+year);
		break;
		case 8:
		System.out.println(day+"/"+"august/"+year);
		break;
		case 9:
		System.out.println(day+"/"+"september/"+year);
		break;
		case 10:
		System.out.println(day+"/"+"october/"+year);
		break;
		case 11:
		System.out.println(day+"/"+"novenber/"+year);
		break;
		case 12:
		System.out.println(day+"/"+"december/"+year);
		break;
	
	
	}
	
	
	}
}
}