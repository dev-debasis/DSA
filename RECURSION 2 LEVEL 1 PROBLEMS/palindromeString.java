public class palindromeString {
    public static void main(String[] args) {
        String str = "madam";
        boolean ans = palin(str);
        System.out.println(ans);
    }

    static boolean palin(String str) {
        // Convert String into Array
        char[] arr = str.toCharArray();
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;

        }

        return true;
    }
}