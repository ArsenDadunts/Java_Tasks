import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        String text1 = "Mary";
        String text2 = "army";
        System.out.println(anagramString(text1,text2));
    }

    public static boolean anagramString(String text1, String text2){
        text1=text1.toLowerCase();
        text2=text2.toLowerCase();
        char [] chars1=text1.toCharArray();
        char [] chars2=text2.toCharArray();
        if (chars1.length!=chars2.length){
            return false;
        }else {
            Arrays.sort(chars1);
            Arrays.sort(chars2);
            for (int i = 0; i < chars1.length; i++) {
                if (chars1[i]!=chars2[i]){
                    return false;
                }
            }
        }
        return true;
    }
}
