package find_the_largest_of_3_Number;

import java.util.Scanner;

public class Largest_of_3_Numbers_with_if_else {

	public static void main(String[] args) {
		
		
		int a, b , c , large;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		a=sc.nextInt();
		
		System.out.println("Enter the value of b: ");
		b=sc.nextInt();
		
		System.out.println("Enter the value of c: ");
		c=sc.nextInt();
		
		if (a>b && a>c)
		{
			large=a;
			System.out.println("Largest Number is: "+large);
			
		}
		else if(b>c)
		{
			large=b;
			System.out.println("Largest Number is: "+large);
		}
		else {
			large=c;
			System.out.println("Largest Number is: "+large);
		}
		
		sc.close();

	}

}
