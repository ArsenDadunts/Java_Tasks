import java.util.Arrays;

public class FindLargestAndSmallestElementInUnsortedArray {
    public static void main(String[] args) {
        int array [] = {5,80,15,4,3,745,15,65,48,36,95,12,35,75};
        printLargestAndSmallestElementInUnsortedArray(array);
    }

    public static void printLargestAndSmallestElementInUnsortedArray(int [] array) {
        Arrays.sort(array);
        System.out.println("The largest element in unsorted Array: "+array[array.length-1]+"\nThe smallest element in unsorted array: "+array[0]);
    }
}
