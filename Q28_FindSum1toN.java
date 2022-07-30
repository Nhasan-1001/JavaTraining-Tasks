import java.util.Scanner;

public class Q28_FindSum1toN
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth NUMBER: ");
        int inp = sc.nextInt();
        System.out.println("Sum of the numbers upto "+inp+" is "+Sum(inp));
    }
    public static int Sum (int inp) {
        if (inp <= 1)
            return inp;
        return inp + Sum(inp - 1);
    }
}