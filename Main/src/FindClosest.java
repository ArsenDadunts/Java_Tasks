public class FindClosest {
    public static void main(String[] args) {
        int arr[] = {10, 22, 28, 29, 30, 40};
        int x = 54;
        printClosest(arr, x, arr.length);
    }

    public static void printClosest(int[] arr, int x, int n) {
        {
            int index_1 = 0, index_2 = 0;
            int l = 0, r = n - 1, diff = Integer.MAX_VALUE;

            while (r > l) {
                if (Math.abs(arr[l] + arr[r] - x) < diff) {
                    index_1 = l;
                    index_2 = r;
                    diff = Math.abs(arr[l] + arr[r] - x);
                }
                if (arr[l] + arr[r] > x) {
                    r--;
                } else {
                    l++;
                }
            }
            System.out.println(" The closest pair is " + arr[index_1] + " and " + arr[index_2]);
        }
    }
}
