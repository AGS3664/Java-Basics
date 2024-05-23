package even_odd;

import java.util.Scanner;


public class Even_Odd_Usingternaryoperator {

	public static void main(String[] args) {

		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the Number : ");
		num = sc.nextInt();
	
		String res=(num%2==0) ? "Even" : "Odd";
		
		if(res=="Even")
		{
			System.out.println("\n" + num + "  is Even Number");
		}

		else {
			System.out.println("\n" + num + "  is Odd Number");
			
		}
		sc.close();
	}

}
