import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindTheLongestPalindromicSubstring {
    public static void main(String[] args) {
        String text="Barevverab Barev Hajox Gignfvns dafbsdi lfdsuidfnsddf bdufbsidf fsbdufbsdisoadgsa gyeeai";
        findTheLongestPalindrom(text);
    }

    public static void findTheLongestPalindrom(String text){
        List<String> list= Arrays.asList(text.split(" "));
        list.replaceAll(String::toLowerCase);
        list.sort(Comparator.comparingInt(String::length));

        System.out.println(list);

        for (int i = list.size() - 1; i >= 0; i--) {
            String string = list.get(i);
            char [] arr = string.toCharArray();
            for (int j = 0, c=arr.length-1; j < arr.length/2; j++, c--) {
                if (arr[j]!=arr[c]){
                    break;
                }
                System.out.println("The longest substring palindrome in String is: " +string);
                System.exit(0);
            }
        }
    }
}
