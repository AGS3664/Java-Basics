package impProblems;

import java.util.Scanner;

public class Swap2No_without_3rdvariable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int a= sc.nextInt();
		
		System.out.println("Enter Second Number");
		int b= sc.nextInt();
		
		System.out.println("Numer Before swap: " +a +" "+b );

		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Numer After swap: " +a +" "+b );
	        
		sc.close();
		

	}

}
