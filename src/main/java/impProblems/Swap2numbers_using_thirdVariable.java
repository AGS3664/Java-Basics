package impProblems;

public class Swap2numbers_using_thirdVariable {

	public static void main(String[] args) {
		System.out.println("Start");
		int x=1;
		int y=2;
		System.out.println("Before Swap");
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);
		
		System.out.println("After Swap");
		int temp=x;
		x=y;
		y=temp;
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);
		
		

	}

}
