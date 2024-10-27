import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        System.out.println(subSeq("", "abc"));
    }

    public static ArrayList<String> subSeq(String p, String up) {
        ArrayList<String> al = new ArrayList<String>();
        helper(p, up, al);
        return al;
    }

    public static void helper(String p, String up, ArrayList<String> al) {
        if (up.isEmpty()) {
            al.add(p);
            return;
        }

        char ch = up.charAt(0);
        
        // Take it
        helper(p + ch, up.substring(1), al);

        // Ignore it
        helper(p, up.substring(1), al);
    }
}