package javaassignments;

import java.util.Scanner;

public class studentmarks {
	
public static void main(String args[])
{
	
	int[][] arr = new int[3][3];
	
    System.out.println("enter student marks");
    for(int i=0;i<3;i++)
    {
    	for(int j=0;j<3;j++)
    	{
    	Scanner d=new Scanner(System.in);
    	arr[i][j]=d.nextInt();
        }
    }

    System.out.println("sum of subject marks of student 1="+(arr[0][0]+arr[0][1]+arr[0][2]));
    System.out.println("sum of subject marks of student 2="+(arr[1][0]+arr[1][1]+arr[1][2]));
    System.out.println("sum of subject marks of student 3="+(arr[2][0]+arr[2][1]+arr[2][2]));
    System.out.println("average of subject marks of student 1="+(arr[0][0]+arr[0][1]+arr[0][2])/3);
    System.out.println("average of subject marks of student 2="+(arr[1][0]+arr[1][1]+arr[1][2])/3);
    System.out.println("average of subject marks of student 2="+(arr[2][0]+arr[2][1]+arr[2][2])/3);
    System.out.println("sum of subject 1 marks of all students="+(arr[0][0]+arr[1][0]+arr[2][0]));
    System.out.println("sum of subject 2 marks of all students="+(arr[0][1]+arr[1][1]+arr[2][1]));
    System.out.println("sum of subject 3 marks of all students="+(arr[0][2]+arr[1][2]+arr[2][2]));
    System.out.println("sum of subject 1 marks of all students="+(arr[0][0]+arr[1][0]+arr[2][0])/3);
    System.out.println("sum of subject 2 marks of all students="+(arr[0][1]+arr[1][1]+arr[2][1])/3);
    System.out.println("sum of subject 3 marks of all students="+(arr[0][2]+arr[1][2]+arr[2][2])/3);
}
}
