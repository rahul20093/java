import java.util.*;

public class oddoreven
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the Range: ");
    int n = s.nextInt();
    s.close();
    String odd = " ";
    String even = " ";
    for (int i = 0; i <= n; i++) 
    {
      if (i%2==0)
      {
        odd = odd + i + ", ";
      }
      else
      {
        even = even + i + ", ";
      }
    }
    System.out.print("Odd Numbers: "+odd+"\n"+"Even Numbers:"+even);
    
  }
}
