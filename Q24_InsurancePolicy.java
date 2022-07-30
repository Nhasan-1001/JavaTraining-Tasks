import java.util.Scanner;

public class Q24_InsurancePolicy
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for MARRIED / Enter 2 for UNMARRIED : ");
        int marital_status = sc.nextInt();
        if (marital_status == 2)
        {
            System.out.println("If gender is MALE, Enter 1 / If gender is FEMALE, Enter 2 : ");
            int gender = sc.nextInt();
            System.out.println("Enter the Age: ");
            int age = sc.nextInt();
            if (gender == 1 && age > 30) {
                System.out.println("CONGRATS! You are ELIGIBLE for the Insurance Policy \n===THANK YOU===");
            }
            else if (gender == 2 && age > 25) {
                System.out.println("CONGRATS! You are ELIGIBLE for the Insurance Policy \n===THANK YOU===");
            }
            else {
                System.out.println("SORRY! You are not eligible for the Insurance Policy \n===THANK YOU===");
            }
        }
        else if (marital_status == 1) {
            System.out.println("CONGRATS! You are ELIGIBLE for the Insurance Policy \n===THANK YOU===");
        }
        else
            System.out.println("WARNING! Give the correct input");
    }

}

