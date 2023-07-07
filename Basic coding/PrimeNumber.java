import java.util.Scanner;
public class PrimeNumber
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter a positive number : ");
		int number=sc.nextInt();
		int divisor_count=1;
		
		for(int i=2;i<=(number/2);i++){
			if(number%i==0){
				divisor_count=divisor_count+1;
			}
		}
		if(divisor_count==1 && number!=1){
			System.out.print(number+" is a prime number");
		}
		else if(number==1){
			System.out.println(number+ " is not a prime number");
		}
		else{
			System.out.print(number+" is not a prime number");
		}
	}
}