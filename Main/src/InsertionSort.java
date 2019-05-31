public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {5, 6, 884, 5, 1, 55, 34, 1, 23, 45, 6, 34, 2, 98, 1, 218, 12, 34, 3, 86, 78, 5, 484, 54984, 435724, 818};
        insertionSort(arr);
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
