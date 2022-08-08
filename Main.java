import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File inFile = new File("C:\\Users\\MSSB2\\Desktop\\CSE 142-143 UW\\CSE 142 UW\\Codes\\customers.txt");
        Scanner sc = new Scanner(inFile);
        int custCount = sc.nextInt();
        Customer custArray[] = new Customer[custCount];

        for(int idx = 0; idx < custCount; idx++){
            double balance = sc.nextDouble();
            int age = sc.nextInt();
            String name = sc.next() + sc.nextLine();
            custArray[idx] = new Customer(name, age, balance);
        }

        System.out.println("Customer Names: \n");
        for (int idx = 0; idx< custCount; idx++){
            System.out.println(custArray[idx]);
        }
        sc.close();
        // Testing Sorting Algorithms
        SortingAlgorithms st = new SortingAlgorithms();
        int[] arr = {3, 2, 5, 7, 1, 9, 8, 55, 41, 99, 4};
        st.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));


    }
}
