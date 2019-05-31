public class ReverseWords {
    static  int age;
    public static void main(String[] args) {
        String text = "Java is programing language";
        System.out.println(alternatingSort(text));
    }

   public static String alternatingSort(String text) {
        String str [] = text.split(" ");
        String result;
        StringBuilder stringBuilder = new StringBuilder();
       for (int i = str.length - 1; i >= 0; i--) {
           stringBuilder.append(str[i]+" ");
       }
       result=stringBuilder.toString();
        return result;
    }

}