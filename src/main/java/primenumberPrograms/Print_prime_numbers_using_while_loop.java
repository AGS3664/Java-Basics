package primenumberPrograms;

public class Print_prime_numbers_using_while_loop {

	public static void main(String[] args) {
		
		int i= 7;
		
		int chk;
		
		while(i<=10)
		{
			int j= 2;	
			chk=0;
			
			while(j<i)
			{	
				if(i%j==0)
				{
				chk++;
				}
				j++;
			}
			if(chk==0)
			{
				System.out.println("Prime Numebres are" +i);
			}
			i++;
		}
			
		
		
	}

}
