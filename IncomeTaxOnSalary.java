//income tax on a salary


package javaassignments;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);                       //entering the salary amount 
		System.out.println("enter the salary amount");
		int salary=s.nextInt();
	 if(salary<180000)
	 {
		 System.out.println("comes under slab A. NO tax on the salary");
	 }
	 else if(salary>180001 && salary<300000)
	 {
		 System.out.println("comes under slab B. Tax percentage is 10%");
		 int tax=(int) (salary *(0.1));
		 System.out.println("tax on salary amount ="+salary+ "is " +tax);
		 
	 }
	 else if(salary>300001 && salary<500000)
	 {
		 System.out.println("comes under slab C. Tax percentage is 20%");
		 int tax=(int) (salary *(0.2));
		 System.out.println("tax on salary amount ="+salary+ " is " +tax);
	 }
	 else{
	 System.out.println("comes under slab D. Tax percentage is 30%");
	 int tax=(int) (salary *(0.3));
	 System.out.println("tax on salary amount ="+salary+ " is " +tax);
	}
	 }
	 
}
