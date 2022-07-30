import java.util.Scanner;

public class Q27_TableOfGivenNumber
{
    static void Print_line (int inp){
        System.out.println("##### TABLE OF "+inp+" #####");
    }
    static void Table (int inp,int i) {
        System.out.println(inp + " * " + i + " = " + inp * i);
        if (i < 10)
            Table(inp, i + 1);
    }
    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        int inp;
        System.out.print("Enter the NUMBER to get the table: ");
        //System.out.println();
        inp = sc.nextInt();
        Print_line(inp);
        Table(inp,1);
    }
}

