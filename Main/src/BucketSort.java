import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class BucketSort {
    public static void main(String[] args) {
        int arr [] = {54,43,23,57,98,76,54,32,12,34,65,87,14,93,23,56,78};
            bucketSort(arr);
    }

    public static void bucketSort(int[] input) {
        final int[] code = hash(input);

        List[] buckets = new List[code[1]];
        for (int i = 0; i < code[1]; i++) {
            buckets[i] = new ArrayList();
        }

        for (int i : input) {
            buckets[hash(i, code)].add(i);
        }

        for (List bucket : buckets) {
            Collections.sort(bucket);
        }

        int ndx = 0;
        for (int b = 0; b < buckets.length; b++) {
            for (int i=0; i<buckets[b].size(); i++) {
                input[ndx++] = (int) buckets[b].get(i);
            }
        }
        printArray(input);
    }

    private static int[] hash(int[] input) {
        int m = input[0];
        for (int i = 1; i < input.length; i++) {
            if (m < input[i]) {
                m = input[i];
            }
        }
        return new int[] { m, (int) Math.sqrt(input.length) };
    }

    private static int hash(int i, int[] code) {
        return (int) ((double) i / code[0] * (code[1] - 1));
    }


    public static void printArray(int [] arr){
        for (int i : arr) {
            System.out.print(i+ " ");
        }
    }
}
