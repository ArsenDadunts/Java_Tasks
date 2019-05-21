public class DeleteDuplicatesFromArray {
    public static void main(String[] args) {
        Integer [] arr = {54,54,65,67,894,1234};
        String [] arr2= {"test", "test2", "test4", "test", "test5", "test2"};
        Character [] arr3 = {'A', 'b', 'f','d','a', 'A','8','f'};
        printArrayWithoutDuplicated(arr);
        printArrayWithoutDuplicated(arr2);
        printArrayWithoutDuplicated(arr3);
    }

    public static void printArrayWithoutDuplicated(Object [] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array = removeTheElement(array, j);
                }
            }
        }
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k]+ " ");
        }
        System.out.println();
    }

    public static Object[] removeTheElement(Object[] arr, int index) {
        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        } else {
            Object[] anotherArray = new Object[arr.length - 1];
            for (int i = 0, k = 0; i < arr.length; i++){
                if (i == index){
                    continue;
                }
                anotherArray[k++] = arr[i];
            }
            return anotherArray;
        }
    }
}
