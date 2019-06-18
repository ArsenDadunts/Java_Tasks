public class MergeStrings {
    public static void main(String[] args) {
        mergeStrings("super", "tower");
    }

    static StringBuilder stringBuilder = new StringBuilder();

    static String mergeStrings(String s1, String s2) {
        StringBuilder temp = new StringBuilder();
        if (s1.isEmpty()) {
            stringBuilder.append(s2);
            System.out.println(stringBuilder.toString() + " result");
            return stringBuilder.toString();
        } else if (s2.isEmpty()) {
            stringBuilder.append(s1);
            System.out.println(stringBuilder.toString() + " result");
            return stringBuilder.toString();
        } else {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) < s2.charAt(i)) {
                    stringBuilder.append(s1.charAt(i));
                    for (int j = i + 1; j < s1.length(); j++) {
                        temp.append(s1.charAt(j));
                    }
                    return mergeStrings(temp.toString(), s2);
                } else {
                    stringBuilder.append(s2.charAt(i));
                    for (int j = i + 1; j < s2.length(); j++) {
                        temp.append(s2.charAt(j));
                    }
                    return mergeStrings(temp.toString(), s1);
                }
            }
            return stringBuilder.toString();
        }
    }
}
