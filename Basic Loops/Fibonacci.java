import java.util.Scanner;
public class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the number of elements :");
		int n=sc.nextInt();
		int FirstNumber=1,SecondNumber=1,NextNumber=0;
		System.out.print(FirstNumber+"  "+SecondNumber+"  ");
		for(int i=3;i<=n;i++){
			NextNumber=FirstNumber+SecondNumber;
			FirstNumber=SecondNumber;
			SecondNumber=NextNumber;
			System.out.print(NextNumber+"  ");
		}	
	}
}