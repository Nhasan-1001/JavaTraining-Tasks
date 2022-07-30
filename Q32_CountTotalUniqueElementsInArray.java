//JAVA program to count a total number of unique elements in an array.

import java.util.Scanner;

public class Q32_CountTotalUniqueElementsInArray {
    public static void main(String[] args) {
        int n;
        int count = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the TOTAL NUMBER of the ELEMENTS: ");
        n = sc.nextInt();

        int[] array = new int [n];
        System.out.println("Enter the ELEMENTS:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++){
            int j = 0;
            for (j = 0; j < i; j++)
              if (array[i] == array[j])
                  break;
          if (i == j)
              count += 1;
        }
        System.out.print("TOTAL NUMBER of UNIQUE ELEMENTS is: "+count);
        }
}

