import java.util.Arrays;
import java.util.Scanner;

//JAVA program to find the second-largest element in an array.
public class Q33_SecondLargestElement {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the TOTAL NUMBER of the ELEMENTS: ");
        n = sc.nextInt();
        if (n < 2){
            System.out.println("ERROR! WRONG INPUT.......TRY AGAIN");
            return;
        }

        int[] array = new int [n];
        System.out.println("Enter the ELEMENTS:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);

        for (int i = n - 2; i >= 0; i--){
            if (array[i] != array[n - 1]){
                System.out.println("SECOND-LARGEST ELEMENT is: "+array[i]);
                return;
            }
        }
        System.out.println("NO any SECOND-LARGEST ELEMENT present");
    }
}
