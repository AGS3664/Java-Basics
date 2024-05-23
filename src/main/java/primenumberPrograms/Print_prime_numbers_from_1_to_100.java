package primenumberPrograms;

public class Print_prime_numbers_from_1_to_100 {

	public static void main(String[] args) {
		
		int i , j , chk;
		System.out.println("Print_prime_numbers_from_1_to_100");
		
		for (i=2;i<=100;i++)
		{  chk=0;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					chk++;
				}
			
			}
			if(chk==0)
			{
				System.out.println("Prim Numebrs are "+i);
			}
		}

	}

}
