import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//Task 43 : Accept a string, replace all vowels from the given string with # symbol and store updated string to file, using file handling.
public class Q43_ReplaceVowels {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String: ");
        String inp = bf.readLine();

        char[] c = new char[inp.length()];
        for (int i = 0; i < inp.length(); i++) {

            if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o'
                    || c[i] == 'u') {

                System.out.println(inp.replace(c[i], '#'));

            }

        }

    }
}
