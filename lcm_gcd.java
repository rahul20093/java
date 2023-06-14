import java.util.Scanner;
 
public class PrintLcmHcfFunction {
 
    public static void main(String[] args) {
        int a, b, t, aTemp, bTemp, lcm, gcd;
        Scanner scanner;
        scanner = new Scanner(System.in);
        // Take two numbers from user
        System.out.println("Enter Two Number");
        a = scanner.nextInt();
        b = scanner.nextInt();
 
        gcd = getGcd(a, b);
        /*
         * GCD(a, b) * LCM(a, b) = a*b
         */
        lcm = (a * b) / gcd;
        System.out.println("LCM = " + lcm);
        System.out.println("GCD = " + gcd);
    }

    public static int getGcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return getGcd(b, a % b);
        }
    }
}
