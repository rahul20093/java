import java.util.Scanner;
import java.lang.Math;

class Main
{
  public static void main(String[] args)
  {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the principal: ");
    double principal = input.nextDouble();

    System.out.print("Enter the rate: ");
    double rate = input.nextDouble();

    System.out.print("Enter the time: ");
    double time = input.nextDouble();

    double S_I = (principal * time * rate) / 100;
    double C_I = (principal * Math.pow((1+rate),time)) - principal;

    System.out.println("Principal: " + principal);
    System.out.println("Interest Rate: " + rate);
    System.out.println("Time Duration: " + time);
    System.out.println("Simple Interest: " + S_I);
    System.out.println("Compund Interest: " + C_I);

    input.close();
  }
}
