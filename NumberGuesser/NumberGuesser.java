package com.aurionpro.test;

import java.util.Scanner;
import java.util.Random;
public class NumberGuesser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rn=new Random();
		int randomNumber=rn.nextInt(101);
		System.out.println("The random number is : "+randomNumber);
		int attempts=0;
		System.out.print("Enter a number between 1 to 100 : ");
		int number=sc.nextInt();
		if(number>0 && number<=100) {
			while(attempts<6){
				attempts+=1;
				if(number<0 || number>100){
					System.out.print("INVALID INPUT : PLEASE ENTER A NUMBER BETWEEN 1 TO 100 : ");
					number=sc.nextInt();
					continue;
				}
				
				if(number<randomNumber) {
					System.out.print("Number is low, enter a higher number : ");
					number=sc.nextInt();
				}
				else if(number>randomNumber) {
					System.out.print("Number is high, enter a lower number : ");
					number=sc.nextInt();
				}
				else if(number==randomNumber){
					System.out.println("You guessed correctly in "+attempts+" attempts!");
					break;
				}
				
				if(attempts==5&& number!=randomNumber) {
					System.out.println("NUMBER OF ATTEMPTS EXHAUSTED");
					break;
				}
				
			}
		}
		else {
			System.out.println("INVALID INPUT : PLEASE ENTER A NUMBER BETWEEN 1 TO 100");
		}
			
	}

}
