package IntroductionToJava;

import java.util.Scanner;

public class FifthProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int count=0;
		for (int i=1;i<=n;i++)
		{ 
			if(n%i==0)
				count ++;
		}
			if(count>2)
			{
				System.out.println("The given number is not a prime number");
							}
			else System.out.println("The given number is a prime number");
			
}
	}

