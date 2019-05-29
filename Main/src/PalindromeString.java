public class PalindromeString {
    public static void main(String[] args) {
        String text = "Bobo";
        System.out.println(checkStringIsPalindrom(text));
    }

    public static boolean checkStringIsPalindrom(String text){
        text = text.toLowerCase();
        char array [] = text.toCharArray();

        for (int i = 0, j=array.length-1; i <array.length/2; i++, j--) {
            if (array[i]!=array[j]){
                return false;
            }
        }
        return true;
    }
}
