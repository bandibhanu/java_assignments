import java.util.Scanner;
class Program1
{
        public static void main(String args[])
        {     
         System.out.println("emter the value1");
	Scanner n=new Scanner(System.in);
	float a=n.nextFloat();
	System.out.println("emter the value2");
	float b=n.nextFloat();
	//Program1 object=new Program1();
	System.out.println(addition(a,b));
	System.out.println(substract(a,b));
	System.out.println(multiplay(a,b));
	System.out.println(division(a,b));
	}
	static float addition(float a,float b)
	{
        	return(a+b);
	}
	static float substract(float a,float b)
	{
	 	return(a-b);	
	}
	static float multiplay(float a,float b)
	{
	 	return(a*b);
	}
	static float division(float a,float b)
	{
	 	return(a/b);	
	}
	

}
