package package1;
import package5.MergeSort;

import java.util.Scanner;
public class NumberSearch {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            int[] array = new int[size];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.print("Enter a number to be searched: ");
            int searchNumber = scanner.nextInt();
            int count = 0;
            for (int i = 0; i < size; i++) {
                if (array[i] == searchNumber) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println(searchNumber + " is present in the array " + count + " time(s).");
            } else {
                System.out.println(searchNumber + " is not present in the array.");
            }

            scanner.close();


            MergeSort.sort(array);
            System.out.println("Sorted array:");
            for (int num : array) {
                System.out.print(num + " ");
            }

            scanner.close();
        }
}




