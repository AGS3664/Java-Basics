package even_odd1;

import java.util.Scanner;

public class Even_Odd_Usingternaryoperator2 {

	public static void main(String[] args) {

		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the Number : ");
		num = sc.nextInt();
	
		int res=(num%2==0) ? 0 : 1;
		
		if(res==0)
		{
			System.out.println("\n" + num + "  is Even Number");
		}

		else {
			System.out.println("\n" + num + "  is Odd Number");
			
		}
		sc.close();
	}

}
