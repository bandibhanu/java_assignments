package javaassignments;

import java.util.Scanner;

public class CUI_Application {
public static void main(String args[])
{
	int count=0;                                       //given strings 
	String useridverify1="bhanu";
	String passwordverify="bhanu";
	Scanner s=new Scanner(System.in);
	for(int i=0;i<=2;i++)
	{
		
	System.out.println("enter user id input");       //giving inputs
	String userid=s.nextLine();
	System.out.println("enter password input");
	String password=s.nextLine();
	
	if(useridverify1.equals(userid)&&passwordverify.equals(password))   //comparing
			{
		System.out.println("welcome"+useridverify1);
            break;
	}
	
count++;
	}
	if(count==3)
	{
	System.out.println("contact admin");
}


}
}
