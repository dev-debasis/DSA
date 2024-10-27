
public class RemovingChar {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("Abaacahja");
        removingChar1(str1, 0);
        String str2 = "Abaacahja";
        System.out.println(removingChar2(str2));
    }

    public static void removingChar1(StringBuilder str, int i) {
        if (i >= str.length()) {
            System.out.println(str);
            return;
        }
        if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
            str.deleteCharAt(i);
            removingChar1(str, i);
        } else {
            removingChar1(str, ++i);
        }

    }

    public static String removingChar2(String str) {
        if (str.isEmpty()) {
            return str;
        }

        char ch = str.charAt(0);

        if (ch == 'a' || ch == 'A') {
            return removingChar2(str.substring(1));
        } else {
           return ch + removingChar2(str.substring(1));
        }

    }
}
