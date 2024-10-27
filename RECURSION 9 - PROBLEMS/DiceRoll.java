// How many ways are there to get 4

import java.util.ArrayList;

public class DiceRoll {
    public static void main(String[] args) {
        System.out.println(combination("", 4));
    }

    public static ArrayList<String> combination(String p, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= target && i <= 6; i++) {
            list.addAll(combination(p + i, target - i));
        }
        return list;
    }
}
