public class ZigZag {
    public static void main(String[] args) {
        int arr[] = {4, 3, 7, 8, 6, 2, 1};
        rearrangeArray(arr);
    }

    public static void  rearrangeArray(int [] arr){
        boolean status = true;
        int temp;

        for (int i=0; i<=arr.length-2; i++) {
            if (status){
                if (arr[i] > arr[i+1]) {
                    temp  = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    System.out.println("if: "+ arr[i]+ " "+arr[i+1]);
                }
            }
            else {
                if (arr[i] < arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    System.out.println("else: "+ arr[i]+ " "+arr[i+1]);
                }
            }
            status = !status;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
