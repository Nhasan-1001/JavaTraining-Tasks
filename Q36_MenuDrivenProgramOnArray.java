
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Q36_MenuDrivenProgramOnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FunctionalArray obj = new FunctionalArray();
        int choice = 0;
        // Main menu for Array operations
        do {
            System.out.println("|---------------------------------------|");
            System.out.println("|-------------- MAIN MENU --------------|");
            System.out.println("|---------------------------------------|");
            System.out.println("PRESS 1 .................... CREATE ARRAY");
            System.out.println("PRESS 2 ................... DISPLAY ARRAY");
            System.out.println("PRESS 3 .................. INSERT ELEMENT");
            System.out.println("PRESS 4 .................. SEARCH ELEMENT");
            System.out.println("PRESS 5 .................. DELETE ELEMENT");
            System.out.println("PRESS 6 ............................ EXIT");
            System.out.print("ENTER HERE: ");

            choice = sc.nextInt();

            if (choice == 1){
                obj.createArray();
            }
            else if (choice == 2) {
                obj.display();
            }
            else if (choice == 3) {
                obj.insert();
            }
            else if (choice == 4) {
                obj.search();
            }
            else if (choice == 5) {
                obj.delete();
            }
            else if (choice == 6) {
                System.exit(0);
            }
        }
        while (true);
    }
}

// FuctionalArray class contains all the methods for different array operations
class FunctionalArray{
    private static int arr[];
    private static int size;
    public void createArray() // method for create an initial array
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER SIZE: ");
        size = sc.nextInt();
        if (!(size <= 0)) {
            arr = new int[size];
            System.out.print("ENTER ELEMENTS in ARRAY: ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("ARRAY Created successfully!");
            display();
            //System.out.println("------------------------------------------");
        } else {
            System.out.println("WARNING! Invalid ARRAY SIZE");
            System.out.println("------------------------------------------");
        }
    }
    // method for display array
    public void display(){
        if(!isEmpty()){
            System.out.println("ELEMENTS in the ARRAY: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------");
    }
    // method for internal operations for insertion
    public int[] copyToNewArray(int[] newArr, int[] originalArr) {
        for (int i = 0; i < originalArr.length; i++) {
            newArr[i]=originalArr[i];
        }
        return newArr;
    }
    // method of insert elements
    public void insert(){
        if(isEmpty()) {
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            do {
                System.out.println();
                System.out.println("|--------------- SUB MENU ---------------|");
                System.out.println("|----------------------------------------|");
                System.out.println("PRESS 1 ............. INSERT POSITION WISE");
                System.out.println("PRESS 2 .................. INSERT AT FIRST");
                System.out.println("PRESS 3 ................... INSERT AT LAST");
                System.out.println("PRESS 4 ........................ MAIN MENU");
                System.out.println("ENTER HERE: ");
                choice = sc.nextInt();

                if (choice == 1) {
                    insertAtPosition(arr);
                } else if (choice == 2) {
                    insertAtFirst(arr);
                } else if (choice == 3) {
                    insertAtLast(arr);
                } else if (choice == 4) {
                    break;
                } else {
                    System.out.println("WARNING! Invalid option");
                    System.out.println("------------------------------------------");
                }
            } while (true);
        }
    }
    public void insertAtPosition(int[] originalArr) // method of insert elements position wise
    {
        if(!isEmpty()) {
            Scanner sc = new Scanner(System.in);
            display();
            System.out.print("ENTER POSITION: ");
            int pos = sc.nextInt();
            if (pos - 1 == 0) {
                insertAtFirst(originalArr);
            } else if (pos - 1 == size - 1) {
                insertAtLast(originalArr);
            } else if (pos < size) {
                System.out.print("ENTER ELEMENT:");
                int newElement = sc.nextInt();
                System.out.println("ARRAY before INSERTION: ");
                display();
                System.out.println("------------------------------------------");
                int newArr[] = new int[size + 1];
                size = size + 1;
                newArr = copyToNewArray(newArr, originalArr);
                for (int i = newArr.length - 2; i >= pos - 1; i--) {
                    newArr[i + 1] = newArr[i];
                }
                newArr[pos - 1] = newElement;
                arr = newArr;
                System.out.println("After INSERTION at position: " +pos+" :");
                display();
                System.out.println("------------------------------------------");
            } else {
                System.out.println("POSITION should be LESS-THAN array size " + size);
                System.out.println("------------------------------------------");
            }
        }
    }
    public void insertAtLast(int[] originalArr) // method of insert elements from last position
    {
        if(!isEmpty()) {
            System.out.println("ENTER ELEMENT:");
            Scanner sc = new Scanner(System.in);
            int newElement = sc.nextInt();
            System.out.println("ARRAY before INSERTION: ");
            display();
            System.out.println("------------------------------------------");
            int newArr[] = new int[size + 1];
            size = size + 1;
            newArr = copyToNewArray(newArr, originalArr);
            newArr[size - 1] = newElement;
            arr = newArr;
            System.out.println("After insertion at LAST: ");
            display();
            System.out.println("------------------------------------------");
        }
    }
    public void insertAtFirst(int[] originalArr) // method of insert elements from first position
    {
        if(!isEmpty()) {
            System.out.println("ENTER ELEMENT: ");
            Scanner sc = new Scanner(System.in);
            int newElement = sc.nextInt();
            System.out.println("ARRAY before INSERTION: ");
            display();
            System.out.println("------------------------------------------");
            int newArr[] = new int[size + 1];
            size = size + 1;
            newArr = copyToNewArray(newArr, originalArr);
            for (int i = newArr.length - 2; i >= 0; i--) {
                newArr[i + 1] = newArr[i];
            }
            newArr[0] = newElement;
            arr = newArr;
            System.out.println("After insertion at FIRST :");
            display();
            System.out.println("------------------------------------------");
        }
    }
    // method of search elements
    public void search(){
        if(!isEmpty()) {
            Scanner sc = new Scanner(System.in);
            System.out.print("ENTER ELEMENT: ");
            int element = sc.nextInt();
            boolean flag = false;
            int x=0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == element) {
                    flag = true;
                    x++;
                }
            }
            if (flag) {
                System.out.println(element+" PRESENT "+x+" time in the ARRAY");
                //System.out.println("Position is: "+);
            } else {
                System.out.println("ELEMENT " + element + " is not PRESENT in the ARRAY");
            }
            display();
            System.out.println("------------------------------------------");
        }
    }
    // method of delete elements
    public void delete()
    {
        if(!isEmpty()) {
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            do {
                System.out.println("------------------------------------------");
                System.out.println("|----------------------------------------|");
                System.out.println("|--------------- SUB MENU ---------------|");
                System.out.println("|----------------------------------------|");
                System.out.println("PRESS 1 ............. DELETE POSITION WISE");
                System.out.println("PRESS 2 ............. DELETE FIRST ELEMENT");
                System.out.println("PRESS 3 .............. DELETE LAST ELEMENT");
                System.out.println("PRESS 4 ........................ MAIN MENU");
                System.out.print("ENTER HERE: ");
                choice = sc.nextInt();

                if (choice == 1) {
                    DeletePositionWise(arr);
                } else if (choice == 2) {
                    deleteFirst(arr);
                } else if (choice == 3) {
                    deleteLast(arr);
                } else if (choice == 4) {
                    break;
                } else {
                    System.out.println("WARNING! Invalid option\nTRY AGAIN");
                    System.out.println("------------------------------------------");
                }
            } while (true);
        }
    }
    public void DeletePositionWise(int [] originalArr) // method of delete elements position wise
    {
        if(!isEmpty()) {
            display();
            Scanner sc = new Scanner(System.in);
            System.out.print("ENTER POSITION: ");
            int pos = sc.nextInt();
            if (pos - 1 < size) {
                int newArr[] = new int[size - 1];
                for (int i = pos - 1; i < originalArr.length - 1; i++) {
                    originalArr[i] = originalArr[i + 1];
                }
                for (int i = 0; i < originalArr.length - 1; i++) {
                    newArr[i] = originalArr[i];
                }
                arr = newArr;
                System.out.println("ELEMENT deleted successfully!");
                System.out.println("ARRAY: ");
                size = size - 1;
                display();
                System.out.println("------------------------------------------");
            }
            else {
                System.out.println("WARNING! Invalid position");
                System.out.println("------------------------------------------");
            }
        }
    }
    public void deleteLast(int[] originalArr) // method of delete elements from last position
    {
        if(!isEmpty()) {
            System.out.println("ARRAY before DELETION: ");
            display();
            System.out.println("------------------------------------------");
            if (!(size - 1 < 0)) {
                System.out.println("ELEMENT " + originalArr[0] + " DELETED successfully!");
                System.out.println("----------------------------------------------------");
                int newArr[] = new int[size - 1];
                for (int i = 0; i < originalArr.length-1; i++) {
                    newArr[i] = originalArr[i];
                }
                arr = newArr;
            }
            System.out.println("ARRAY After deleting LAST ELEMENT:");
            size = size - 1;
            display();
            System.out.println("------------------------------------------");
        }
    }
    public void deleteFirst(int[] originalArr) // method of delete elements from first position
    {
        if(!isEmpty()) {
            System.out.println("ARRAY before DELETION: ");
            display();
            System.out.println("------------------------------------------");
            if (!(size - 1 < 0)) {
                System.out.println("ELEMENT " + originalArr[0] + " DELETED successfully!");
                System.out.println("----------------------------------------------------");
                int newArr[] = new int[size - 1];
                for (int i = 1; i < originalArr.length; i++) {
                    newArr[i - 1] = originalArr[i];
                }
                arr = newArr;
            }
            System.out.println("ARRAY after deleting First element:");
            size = size - 1;
            display();
            System.out.println("------------------------------------------");
        }
    }
    // method for catching error for empty or not initialize array
    public boolean isEmpty(){
        if(arr!=null && !(size <= 0))
            return false;
        else {
            System.out.println("ARRAY is EMPTY");
            System.out.println("------------------------------------------");
            return true;
        }
    }
}