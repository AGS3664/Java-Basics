package impProblems1;

import java.util.Scanner;

public class Given_No_PrimeorNot {
	
	public static void main (String[] args) {

		
		Scanner sc =new Scanner(System.in);

		System.out.println("Please Enter Number: ");
		int a=sc.nextInt();
		
		
		if (a%2==0) 
		{
		
			System.out.println("Number is Pime");
			
		}
		else {
			System.out.println("Number is not Pime");
		}
		
		sc.close();
	}
}
	
	
	
