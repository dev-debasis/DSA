//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class Leetcode1 {
    public static void main(String[] args) {
        char[] letters = { 'a', 'c', 'e', 'g', 'i' };
        char target = 'i';
        char element = finding(letters, target);
        System.out.println(element);
    }

    public static char finding(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
