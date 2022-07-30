import java.util.Scanner;

public class Q26_ElectricityBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Electricity unit charge");
        double Unit = sc.nextInt();
        double Charge = 0;

        if(Unit <= 50) {
            Charge = Unit * 0.50;
        }

        else if(Unit <= 150) {
            Charge = 25 + ((Unit - 50) * 0.75);
        }
        else if(Unit <= 250) {
            Charge = 100 + ((Unit - 150) * 1.20);
        }
        else {
            Charge = 220 + ((Unit - 250) * 1.50);
        }
        double TempCharge = Charge * 0.20;
        double Bill = Charge + TempCharge;
        System.out.print("The total electricity bill is : " + Bill);
    }
}
