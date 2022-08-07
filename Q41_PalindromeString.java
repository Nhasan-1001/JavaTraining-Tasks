//Q.41 Write a program check given String is Palindrome or not
import java.util.Scanner;

public class Q41_PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string you want to check:");
        String inp = sc.nextLine();
        String ref = "";
        int n = inp.length();
        for(int i = n - 1; i >= 0; i--)
        {
            ref = ref + inp.charAt(i);
        }
        if(inp.equalsIgnoreCase(ref))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }
    }
}
