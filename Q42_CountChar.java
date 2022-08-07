import java.util.Scanner;

//Task 42 : Accept string and count the number of alphabets, digits, spaces, special characters & words in the given string.
public class Q42_CountChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence you want to check:");
        String inp = sc.nextLine();
        count(inp);
    }
    public static void count(String inp){
        char[] ch = inp.toCharArray();
        int alphabet = 0;
        int digit = 0;
        int space = 0;
        int special = 0;
        int word = 1;
        for(int i = 0; i < inp.length(); i++){
            if(Character.isLetter(ch[i])){
                alphabet ++ ;
            }
            else if(Character.isDigit(ch[i])){
                digit ++ ;
            }
            else if(Character.isSpaceChar(ch[i])){
                space ++ ;
            }
            else{
                special ++;
            }
        }
        for (int i = 0; i < inp.length() - 1; i++){
            if ((inp.charAt(i) == ' ') && (inp.charAt(i + 1) != ' '))
            {
                word++;
            }
        }
        System.out.println("The Sentence is: "+inp);
        System.out.println("Number of Alphabets: " + alphabet);
        System.out.println("Number of Digits: " + digit);
        System.out.println("Number of Spaces: " + space);
        System.out.println("Number of Special Characters: " + special);
        System.out.println("Number of Words: " + word);
    }
}
