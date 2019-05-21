public class AllPermutations {
    public static void main(String[] args) {
        String text = "GOD";
        int textLength = text.length();
        printAllPermutations(text, 0, textLength-1);
    }

    public static void printAllPermutations(String text, int start, int length) {
        if (start == length){
            System.out.println(text);
        }else{
            for (int i = start; i <=length; i++)
            {
                text = swap(text,start,i);
                printAllPermutations(text, start+1, length);
                text = swap(text,start,i);
            }
        }
    }

    public static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
