import java.util.Scanner;

//JAVA program to find maximum and minimum number from given array by passing array to the function.
public class Q35_MaxMinArray {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("How Many numbers of ELEMENTS you want to INSERT: ");
    int n = sc.nextInt();
    int [] arr = new int[n];
    System.out.println("Enter the ELEMENTS: ");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    System.out.println("MAXIMUM number in the ARRAY: "+getMaximum(arr,n));
    System.out.println("MINIMUM number in the ARRAY: "+getMinimum(arr,n));
    }
    static  int getMinimum (int arr[],int n)
    {
        int result = arr[0];
        for (int i = 1; i < n; i++)
            result = Math.min(result,arr[i]);
        return result;
    }
    static int getMaximum (int arr[],int n){
        int result = arr[0];
        for (int i = 1; i < n; i++)
            result = Math.max(result,arr[i]);
        return result;
    }
}
