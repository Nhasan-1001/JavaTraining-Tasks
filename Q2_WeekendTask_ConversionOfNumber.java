import java.util.InputMismatchException;
import java.util.Scanner;

public class Q2_WeekendTask_ConversionOfNumber {
    public static final String colourGreen = "\u001B[32m";
    public static final String colourYellow = "\u001B[33m";
    public static final String colourRed = "\u001B[31m";
    public static final String colourReset = "\u001B[0m";

    public static void main(String[] args) {
        int choice;
        int options;
        Scanner sc = new Scanner(System.in);
        do {
            //try {
                System.out.println();
                System.out.println(colourGreen + "|----------------------------------------------|\n" + colourReset +
                        colourGreen + "|" + colourReset + "           NUMBER-SYSTEM CONVERSION           " + colourGreen + "|\n" + colourReset +
                        colourGreen + "|----------------------------------------------|" + colourReset);
                //System.out.println("----------------------------------------------");
                System.out.println("From Which NUMBER-SYSTEM you want to convert?");
                System.out.println("PRESS 1........DECIMAL\nPRESS 2........BINARY\nPRESS 3........OCTAL\nPRESS 4........HEXADECIMAL\n" +
                        "PRESS 5........EXIT");
                System.out.print(colourGreen + "PRESS the NUMBER: " + colourReset);
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println();
                        System.out.println("DECIMAL to which NUMBER-SYSTEM you want to convert?");
                        System.out.println("PRESS 1..........BINARY\nPRESS 2..........OCTAL\nPRESS 3..........HEXADECIMAL");
                        System.out.print(colourGreen + "PRESS the NUMBER: " + colourReset);
                        options = sc.nextInt();
                        if (options == 1) {
                                System.out.println();
                                System.out.println("You are CONVERTING DECIMAL to BINARY");
                                System.out.print(colourGreen + "Enter the DECIMAL NUMBER: " + colourReset);
                                try {
                                    int decimal1 = sc.nextInt();
                                    System.out.println(colourYellow + "BINARY of " + decimal1 + " is: " + Integer.toBinaryString(decimal1) + colourReset);
                                    System.out.println("------------------------------------------------------------");
                                }
                                catch (InputMismatchException e){
                                    System.out.println("Wrong!"+e);
                                }
                                break;
                            }
                        else if (options == 2) {
                                System.out.println();
                                System.out.println("You are CONVERTING DECIMAL to OCTAL");

                                System.out.print(colourGreen + "Enter the DECIMAL NUMBER: " + colourReset);
                                int decimal2 = sc.nextInt();
                                System.out.println(colourYellow + "OCTAL of " + decimal2 + " is: " + Integer.toOctalString(decimal2) + colourReset);
                                System.out.println("------------------------------------------------------------");

                            } else if (options == 3) {
                                System.out.println();
                                System.out.println("You are CONVERTING DECIMAL to HEXADECIMAL");
                                System.out.print(colourGreen + "Enter the DECIMAL NUMBER: " + colourReset);
                                int decimal3 = sc.nextInt();
                                System.out.println(colourYellow + "HEXADECIMAL of " + decimal3 + " is: " + Integer.toHexString(decimal3) + colourReset);
                                System.out.println("------------------------------------------------------------");

                            } else {
                                System.out.println(colourRed + "WARNING! You have entered a wrong Input\nPlease TRY AGAIN" + colourReset);
                                System.out.println("------------------------------------------------------------");
                            }
                            break;
                    case 2:
                        System.out.println();
                        System.out.println("BINARY to which NUMBER-SYSTEM you want to convert?");
                        System.out.println("PRESS 1..........DECIMAL\nPRESS 2..........OCTAL\nPRESS 3..........HEXADECIMAL");
                        System.out.print(colourGreen + "PRESS the NUMBER: " + colourReset);
                        options = sc.nextInt();

                        if (options == 1) {
                            System.out.println();
                            System.out.println("You are CONVERTING BINARY to DECIMAL");
                            try {
                                System.out.print(colourGreen + "Enter the BINARY NUMBER: " + colourReset);
                                String binary1 = sc.next();
                                int decimal = Integer.parseInt(binary1, 2);
                                System.out.println(colourYellow + "DECIMAL of " + binary1 + " is: " + decimal + colourReset);
                                System.out.println("------------------------------------------------------------");
                            } catch (NumberFormatException e) {
                                System.out.println(colourRed + "WRONG INPUT! BINARY digits only contains 0 and 1, TRY AGAIN" + colourReset);
                                System.out.println("------------------------------------------------------------");
                            }
                        } else if (options == 2) {
                            System.out.println();
                            System.out.println("You are CONVERTING BINARY to OCTAL");
                            try {
                                System.out.print(colourGreen + "Enter the BINARY NUMBER: " + colourReset);
                                String binary2 = sc.next();
                                int new_binary = Integer.parseInt(binary2, 2);
                                String octal_string = Integer.toOctalString(new_binary);
                                int octal = Integer.parseInt(octal_string);
                                System.out.println(colourYellow + "OCTAL of " + binary2 + " is: " + octal + colourReset);
                                System.out.println("------------------------------------------------------------");
                            } catch (NumberFormatException e) {
                                System.out.println(colourRed + "WRONG INPUT! BINARY digits only contains 0 and 1, TRY AGAIN" + colourReset);
                                System.out.println("------------------------------------------------------------");
                            }
                        } else if (options == 3) {
                            System.out.println();
                            System.out.println("You are CONVERTING BINARY to HEXADECIMAL");
                            try {
                                System.out.print(colourGreen + "Enter the BINARY NUMBER: " + colourReset);
                                String binary3 = sc.next();
                                int decimal = Integer.parseInt(binary3, 2);
                                String hex = Integer.toHexString(decimal).toUpperCase();
                                System.out.println(colourYellow + "HEXADECIMAL of " + binary3 + " is: " + hex + colourReset);
                                System.out.println("------------------------------------------------------------");
                            } catch (NumberFormatException e) {
                                System.out.println(colourRed + "WRONG INPUT! BINARY digits only contains 0 and 1, TRY AGAIN" + colourReset);
                                System.out.println("------------------------------------------------------------");
                            }
                        } else {
                            System.out.println(colourRed + "WARNING! You have entered a wrong Input\nPlease TRY AGAIN" + colourReset);
                            System.out.println("------------------------------------------------------------");
                        }
                        break;
                    case 3:
                        System.out.println();
                        System.out.println("OCTAL to which NUMBER-SYSTEM you want to convert?");
                        System.out.println("PRESS 1..........DECIMAL\nPRESS 2..........BINARY\nPRESS 3..........HEXADECIMAL");
                        System.out.print(colourGreen + "PRESS the NUMBER: " + colourReset);
                        options = sc.nextInt();


                        if (options == 1) {
                            System.out.println();
                            System.out.println("You are CONVERTING OCTAL to DECIMAL");

                            try {
                                System.out.print(colourGreen + "Enter the OCTAL NUMBER: " + colourReset);
                                String octal = sc.next();
                                int decimal = Integer.parseInt(octal, 8);
                                System.out.println(colourYellow + "DECIMAL of " + octal + " is: " + decimal + colourReset);
                                System.out.println("------------------------------------------------------------");
                            } catch (NumberFormatException e) {
                                System.out.println(colourRed + "WRONG INPUT! OCTAL digit/digits should be in the RANGE of 0 to 7\nTRY AGAIN" + colourReset);
                                System.out.println("------------------------------------------------------------");
                                break;
                            }
                        } else if (options == 2) {
                            System.out.println();
                            System.out.println("You are CONVERTING OCTAL to BINARY");
                            try {
                                System.out.print(colourGreen + "Enter the OCTAL NUMBER: " + colourReset);
                                String octal = sc.next();
                                int decimal = Integer.parseInt(octal, 8);
                                String binary = Integer.toBinaryString(decimal);
                                System.out.println(colourYellow + "BINARY of " + octal + " is: " + binary + colourReset);
                                System.out.println("------------------------------------------------------------");
                            } catch (NumberFormatException e) {
                                System.out.println(colourRed + "WRONG INPUT! OCTAL digit/digits should be in the RANGE of 0 to 7\nTRY AGAIN" + colourReset);
                                System.out.println("------------------------------------------------------------");
                            }

                        } else if (options == 3) {
                            System.out.println();
                            System.out.println("You are CONVERTING OCTAL to HEXADECIMAL");
                            try {
                                System.out.print(colourGreen + "Enter the OCTAL NUMBER: " + colourReset);
                                String octal = sc.next();
                                int decimal = Integer.parseInt(octal, 8);
                                String hex = Integer.toHexString(decimal).toUpperCase();
                                System.out.println(colourYellow + "HEXADECIMAL of " + octal + " is: " + hex + colourReset);
                                System.out.println("------------------------------------------------------------");
                            } catch (NumberFormatException e) {
                                System.out.println(colourRed + "WRONG INPUT! OCTAL digit/digits should be in the RANGE of 0 to 7\nTRY AGAIN" + colourReset);
                                System.out.println("------------------------------------------------------------");
                            }
                        } else {
                            System.out.println(colourRed + "WARNING! You have entered a wrong Input\nPlease TRY AGAIN" + colourReset);
                            System.out.println("------------------------------------------------------------");
                        }
                        break;
                    case 4:
                        System.out.println();
                        System.out.println("HEXADECIMAL to which NUMBER-SYSTEM you want to convert?");
                        System.out.println("PRESS 1..........DECIMAL\nPRESS 2..........BINARY\nPRESS 3..........OCTAL");
                        System.out.print(colourGreen + "PRESS the NUMBER: " + colourReset);
                        options = sc.nextInt();

                        if (options == 1) {
                            System.out.println();
                            System.out.println("You are CONVERTING HEXADECIMAL to DECIMAL");
                            try {
                                System.out.print(colourGreen + "Enter the HEXADECIMAL NUMBER: " + colourReset);
                                String hex = sc.next();
                                int decimal = Integer.parseInt(hex, 16);
                                System.out.println(colourYellow + "DECIMAL of " + hex + " is: " + decimal + colourReset);
                                System.out.println("------------------------------------------------------------");
                            } catch (NumberFormatException e) {
                                System.out.println(colourRed + "WRONG INPUT! HEXADECIMAL digits only contains 0 to 9 " +
                                        "or combination of alphabet A to G , TRY AGAIN" + colourReset);
                                System.out.println("------------------------------------------------------------");
                            }
                        } else if (options == 2) {
                            System.out.println();
                            System.out.println("You are CONVERTING HEXADECIMAL to BINARY");
                            try {
                                System.out.print(colourGreen + "Enter the HEXADECIMAL NUMBER: " + colourReset);
                                String hex = sc.next();
                                int decimal = Integer.parseInt(hex, 16);
                                String binary = Integer.toBinaryString(decimal);
                                System.out.println(colourYellow + "BINARY of " + hex + " is: " + binary + colourReset);
                                System.out.println("------------------------------------------------------------");
                            } catch (NumberFormatException e) {
                                System.out.println(colourRed + "WRONG INPUT! HEXADECIMAL digits only contains 0 to 9 " +
                                        "or combination of alphabet A to G , TRY AGAIN" + colourReset);
                                System.out.println("------------------------------------------------------------");
                            }
                        } else if (options == 3) {
                            System.out.println();
                            System.out.println("You are CONVERTING HEXADECIMAL to OCTAL");
                            try {
                                System.out.print(colourGreen + "Enter the HEXADECIMAL NUMBER: " + colourReset);
                                String hex = sc.next();
                                int decimal = Integer.parseInt(hex, 16);
                                String octal = Integer.toOctalString(decimal);
                                System.out.println(colourYellow + "OCTAL of " + hex + " is: " + octal + colourReset);
                                System.out.println("------------------------------------------------------------");
                            } catch (NumberFormatException e) {
                                System.out.println(colourRed + "WRONG INPUT! HEXADECIMAL digits only contains 0 to 9 " +
                                        "or combination of alphabet A to G , TRY AGAIN" + colourReset);
                                System.out.println("------------------------------------------------------------");
                            }
                        } else {
                            System.out.println(colourRed + "WARNING! You have entered a wrong Input\nPlease TRY AGAIN" + colourReset);
                            System.out.println("------------------------------------------------------------");
                        }
                        break;
                    case 5: {
                        System.exit(0);
                    }
                    default:
                        System.out.println(colourRed + "WARNING! You have entered a wrong Input\nPlease TRY AGAIN" + colourReset);
                        System.out.println("------------------------------------------------------------");

                }
            }
        while (choice != 0);

    }
}

