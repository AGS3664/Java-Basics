package primenumberPrograms;

import java.util.Scanner;

public class Print_prime_numbers_in_given_range {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the Range :" );
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		System.out.println("\n Please enter the Prime Numebr in given Range ");
		
		
		for(int i=start;i<=end;i++)
		{
			int chk=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					chk++;
				}
			}
			if (chk==0)
			{
				System.out.println("Prime Numebers are :" +i);
			}
		}
		sc.close();
	}

}
