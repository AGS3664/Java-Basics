package even_odd1;

import java.util.Scanner;

public class Even_Odd_withoutusingModulusOperator {

	public static void main(String[] args) {

		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the Number : ");
		num = sc.nextInt();
	
		float res=(float) num/2;
		int newres= num/2;
		
		if((res)==(newres))
		{
			System.out.println("\n" +num+ "is Even Number");
		}
		else {
			System.out.println("\n" +num+ " is Odd Number");
		}
		
		sc.close();
	}

}
