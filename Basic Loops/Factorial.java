import java.util.Scanner;
public class Factorial
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number=sc.nextInt();
		long factorial=1;
		if(number==0)
		{
			System.out.println("Factorial of "+number+" is : "+factorial);
		}
		else if(number>0)
		{
			for(int i=2;i<=number;i++)
			{
				factorial=factorial*i;
			}
			System.out.println("Factorial of "+number+" is : "+factorial);
		}
		else
		{
			System.out.println("PLEASE PROVIDE A WHOLE NUMBER");
		}
	}
}