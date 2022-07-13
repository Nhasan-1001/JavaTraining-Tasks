import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===Enter the FOUR values to find the max among them===");
        System.out.println("Value of FIRST NUMBER: ");
        int n1 = sc.nextInt();
        System.out.println("Value of SECOND NUMBER: ");
        int n2 = sc.nextInt();
        System.out.println("Value of THIRD NUMBER: ");
        int n3 = sc.nextInt();
        System.out.println("Value of FOURTH NUMBER: ");
        int n4 = sc.nextInt();
        int max;

        max = (n1 > n2 && n1 > n3 && n1 > n4) ?
                n1 : ((n2 > n3 && n2 > n4) ?
                n2 : (n3 > n4 ? n3 : n4));

        System.out.println("Largest number among " +
                n1 + ", " + n2 + ", "+ n3 +
                " and " + n4 + " is " + max + ". " );
    }
}
