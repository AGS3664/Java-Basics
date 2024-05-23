package primenumberPrograms;

public class Print_first_10_prime_numbers1 {

	public static void main(String[] args) {
		
		int i , j , chk;
		int cnt=0;
		System.out.println("First 10 prime Numbers are : ");
		for (i=2;cnt<=10;i++)
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
				System.out.println(+i +" ");
				cnt++;
			}
		}
		
	}

}
