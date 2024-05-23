package primenumberPrograms1;

import java.util.Scanner;

public class Print_prime_numbers_from_1_to_n_SysInput {

	public static void main(String[] args) {
		
		int i , j , chk=0;
		
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Please enter the Number:" );
		int n = sc.nextInt();
		
		System.out.println("\n Please enter the ");
		
		
		for(i=2;i<=n;i++)
		{
			chk=0;
			for(j=2;j<i;j++)
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
	}

}
