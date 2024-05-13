package package5;

public class MergeSort {
    public static void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }

    private static void merge(int[] array, int left, int middle, int right) {
        int[] tempArray = new int[array.length];
        for (int i = left; i <= right; i++) {
            tempArray[i] = array[i];
        }

        int i = left, j = middle + 1, k = left;
        while (i <= middle && j <= right) {
            if (tempArray[i] <= tempArray[j]) {
                array[k++] = tempArray[i++];
            } else {
                array[k++] = tempArray[j++];
            }
        }

        while (i <= middle) {
            array[k++] = tempArray[i++];
        }
    }
}

