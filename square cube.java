import java.util.Scanner;
public class squareandcube
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the decimal number : ");
		double number = input.nextDouble();
		double square = number * number;
		double cube = number * number * number;
		
		System.out.printf("Square of %.2f is %.2f%n", number, square);
		System.out.printf("cube of %.2f is %.2f%n", number, cube);
	}
}
