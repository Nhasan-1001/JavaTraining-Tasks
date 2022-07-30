import java.util.Scanner;

public class Q29_PrintAlphabetPattern {
    public static void main(String args[])
    {
        int i,j,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of lines: ");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=i;j<=n;j++)
            {
                System.out.print((char)(j+64));
            }
            System.out.println("");
        }
    }
}
