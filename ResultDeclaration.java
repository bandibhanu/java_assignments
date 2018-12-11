package javaassignments;

import java.util.Scanner;

public class SubjectMarks {
	public static void main(String args[])
	{
 		Scanner s=new Scanner(System.in);
		System.out.println("enter value 1");
		int subject1=s.nextInt();
		System.out.println("enter value 2");
		int subject2=s.nextInt();
		System.out.println("enter value 3");
		int subject3=s.nextInt();

	if(subject1>60&&subject2>60&&subject3>60)
	{
		System.out.println("passed");
	}
	else if((subject1>60&&subject2>60)||(subject2>60&&subject3>60)||(subject3>60&&subject1>60))
	{
		System.out.println("pramoted");
	}
	else
	{
		System.out.println("fail");
	}
	}
}