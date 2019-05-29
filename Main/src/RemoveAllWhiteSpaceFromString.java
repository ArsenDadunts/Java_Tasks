public class RemoveAllWhiteSpaceFromString {
    public static void main(String[] args) {
        String text = "Remove  all white space from String";
        removeWhiteSpaces(text);
    }

    public static void removeWhiteSpaces(String text) {
        char[] array = text.toCharArray();
        char[] array2;
        int length=0;
        int j=0;

        for (int i = 0; i < array.length; i++) {
            if (array[i]!=' '){
                length++;
            }
        }

        array2=new char[length];

        for (int i = 0; i <array.length; i++) {
            if (array[i]!=' '){
                array2[j]=array[i];
                j++;
            }
        }

        for (char a:array2){
            System.out.print(a);
        }

    }
}
