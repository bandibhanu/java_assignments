package javaassignments;
import java.util.Scanner;
public class JavaSquare {


		public static void main(String args[])
		{
			 int n;
			
			 Scanner s = new Scanner(System.in); 
			 n=s.nextInt();
			JavaSquare value = new JavaSquare(n);

			}
		JavaSquare(int n)
		{
			 System.out.println("given input is "+ n);
			 for(int i=1;i<=10;i++)
			 {
			 int x=(i*n);
			 System.out.println(n+"*"+i+"------>"+x+"\t\t" + x*x);
			 }
		}
	}
