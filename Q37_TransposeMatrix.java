import java.util.Scanner;

//JAVA program to find transpose of a given matrix.
public class Q37_TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===TRANSPOSE MATRIX===");
        System.out.print("Enter the ROW value: ");
        int row = sc.nextInt();
        System.out.print("Enter the COLUMN value: ");
        int column = sc.nextInt();
        int [][] matrix = new int [row][column];
        System.out.println("Enter the ELEMENTS: ");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                matrix [i] [j] = sc.nextInt();
            }
        }
        int [][] transpose = new int [column][row];
        for (int i = 0; i < column; i++){
            for (int j = 0; j < row; j++){
                transpose[i][j] = matrix[j][i];
            }
        }
        System.out.println("ORIGINAL MATRIX");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("TRANSPOSE MATRIX");
        for (int i = 0; i < column; i++){
            for (int j = 0; j < row; j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}

