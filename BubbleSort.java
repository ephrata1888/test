package package4;

    public class BubbleSort {
        public static void main(String[] args) {
            char[] array = {'d', 'b', 'a', 'c', 'f', 'e'};
            System.out.println("Original array:");
            displayArray(array);
            bubbleSort(array);

            System.out.println("\nSorted array:");
            displayArray(array);
        }

        public static void bubbleSort(char[] array) {
            int n = array.length;
            boolean swapped;

            for (int i = 0; i < n - 1; i++) {
                swapped = false;
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        // Swap array[j] and array[j+1]
                        char temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        swapped = true;
                    }
                }
                if (!swapped) {
                    break;
                }
            }
        }
        public static void displayArray(char[] array) {
            for (char element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

