// import java.util.Arrays;

public class SkipString {
    public static void main(String[] args) {
        String str = "orangeapplebananaapp";
        System.out.println(skipApple(str));
        System.out.println(skipAppNotApple(str));
    }

    public static String skipApple(String str) {
        if (str.isEmpty()) {
            return str;
        }
        char ch = str.charAt(0);
        if (str.startsWith("apple")) {
            return skipApple(str.substring(5));
        } else {
            return ch + skipApple(str.substring(1));
        }
    }

    public static String skipAppNotApple(String str) {
        if (str.isEmpty()) {
            return str;
        }
        char ch = str.charAt(0);
        if (str.startsWith("app") && !str.startsWith("apple")) {
            return skipAppNotApple(str.substring(3));

        } else {
            return ch + skipAppNotApple(str.substring(1));
        }
    }
}