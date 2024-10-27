package LINEAR;

import java.util.*;


public class StringSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String name = sc.nextLine();
        System.out.print("Enter character search for : ");
        char target = sc.next().charAt(0);
        // To fetch the index
        int index = linearSearchStringIndex(name, target);
        System.out.println(index);
        // To fetch the element
        char element = linearSearchStringElement(name, target);
        System.out.println(element);
        // Find in a range
        System.out.println(" Enter the start & end index : ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        int  index1 = linearSearchStringElementInRange(name, target, start, end);
        System.out.println(index1);
        sc.close();
    }

    public static int linearSearchStringIndex(String name, char target) {
        for (int i = 0; i < name.length(); i++) {
            char element = name.charAt(i);
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
    // We can also use for each but for that we need array that's why we will
    // convert the string to an array first

    public static char linearSearchStringElement(String name, char target) {
        for (char element : name.toCharArray()) {
            if (element == target) {
                return element;
            }
        }
        return '\0';
    }

    // Find in a range
    public static int linearSearchStringElementInRange(String name,char target, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (name.charAt(i) == target) {
                return i;
            }
        }
        return -1;
    }
}
