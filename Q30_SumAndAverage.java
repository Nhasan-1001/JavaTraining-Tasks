import java.util.Scanner;

//Write a program in java to find the sum and average of all elements of the array.
public class Q30_SumAndAverage {
    public static void main(String[] args)
    {
        int n;
        int sum = 0;
        float average;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the NUMBER of ELEMENTS: ");
        n = sc.nextInt();
        int array [] = new int[n];
        System.out.println("Enter the ELEMENTS:");
        for(int i = 0; i < n ; i++)
        {
            array[i] = sc.nextInt();
            sum += array[i];
        }
        System.out.println("SUM IS: "+sum);
        average =  ((float) sum) / n;
        System.out.println("AVERAGE IS: "+average);
    }
}
