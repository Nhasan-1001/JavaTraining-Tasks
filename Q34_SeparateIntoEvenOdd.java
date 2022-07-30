import java.util.Scanner;

//JAVA program to input n number of elements in an array and separate them into even and odd two different arrays.
public class Q34_SeparateIntoEvenOdd {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the TOTAL NUMBER of the ELEMENTS: ");
        n = sc.nextInt();
        if (n < 2) {
            System.out.println("ERROR! WRONG INPUT.......TRY AGAIN");
            return;
        }

        int[] array = new int[n];
        System.out.println("Enter the ELEMENTS:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int even_n = 0;
        int odd_n = 0;
        for (int i = 0; i < n; i++){
            if (array[i] % 2 == 0)
                even_n++;
            else
                odd_n++;
        }
        int [] even = new int[even_n];
        int [] odd = new int[odd_n];

        int j = 0;
        int k = 0;
        for (int i = 0; i < n; i++){
            if (array[i] % 2 == 0) {
                even[j] = array[i];
                j++;
            }
            else {
                odd[k] = array[i];
                k++;
            }
        }
        System.out.println("EVEN ARRAY:");
        for (int i = 0; i < even_n; i++) {
            System.out.println(even[i]);
        }
        //System.out.println();
        System.out.println("ODD ARRAY:");
        for (int i = 0; i < odd_n; i++) {
            System.out.println(odd[i]);
        }
    }
}