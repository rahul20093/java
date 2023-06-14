import java.util.Scanner;
public class VowCon
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = scanner.nextLine();
        
        String consonants = "";
        String vowels = "";
        
        word = word.toLowerCase();
        
        for(int i=0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            
            if(ch >= 'a' && ch <= 'z')
            {
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    vowels+=ch;
                }
                else
                {
                    consonants+=ch;
                }
            }
        }
        System.out.println("Vowels : " +vowels);
        System.out.println("consonants : " +consonants);
    }
}
