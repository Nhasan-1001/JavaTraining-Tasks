import java.util.Scanner;

public class Q25_CTC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the BASIC SALARY of the employee: ");
        double basic_salary = sc.nextInt();
        double ta = basic_salary*0.1;
        double da = basic_salary*0.15;
        double hra = basic_salary*0.2;
        double pf = basic_salary*0.12;
        double gross_salary;
        double bonus;
        if (basic_salary >= 20000) {
            bonus = basic_salary * 0.1;
        }
        else {
            bonus = basic_salary * 0.2;
        }
        gross_salary = basic_salary+da+ta+hra+bonus - pf;
        System.out.println("The GROSS SALARY of the employee is: "+gross_salary);
    }
}
