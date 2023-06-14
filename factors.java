import java.util.Scanner;
public class Factors
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer : ");
		int number = input.nextInt();
		
		System.out.println("Factors of "+ number + ": ");
		for (int i=1; i<=number; ++i)
		{
			if (number%i==0)
			{
				System.out.print(i+" ");
			}
		}
	}
}
