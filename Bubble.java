package junit;

import java.util.Scanner;

public class Bubble {

	public static void main()
	{
		int length;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		length=sc.nextInt();
		 int inputArray[]=new int[length];
		 int tempValue;
		for(int start=0;start<length;start++)
		{
			inputArray[start]=sc.nextInt();
		}
		for(int temp=0;temp<length;temp++)
		{
			for(int insidetemp=0;insidetemp<length;insidetemp++)
			{
				if(inputArray[insidetemp]>inputArray[insidetemp+1])
				{
					temp=inputArray[insidetemp];
					inputArray[insidetemp]=inputArray[insidetemp+1];
					inputArray[insidetemp+1]=temp;
				}
			}
		}
		for(int printing=0;printing<length;printing++)
		{
			System.out.println(inputArray[printing]);
		}
			
		}
	}

