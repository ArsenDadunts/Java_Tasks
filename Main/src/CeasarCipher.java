public class CeasarCipher {
    public static void main(String[] args) {
        String code = "Ceasar cipher";
        System.out.println(decode(code));
    }

    public static String decode(String code) {
        char[] chars = code.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {

            } else {
                chars[i] += 5;
            }
        }
        code = String.valueOf(chars);
        return code;
    }
}
