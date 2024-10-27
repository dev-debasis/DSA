package LINEAR;

// https://leetcode.com/problems/richest-customer-wealth/
public class Leetcode2 {
    public static void main(String[] args) {
        int[][] accounts = { { 1, 2, 3, 5, 6 }, { 4, 5, 6, 7 }, { 4, 5, 6, 7 } };
        int[] sumOfMoney = new int[accounts.length];
        for (int customer = 0; customer < accounts.length; customer++) {
            int tempMoney = 0;
            for (int money = 0; money < accounts[customer].length; money++) {
                tempMoney += accounts[customer][money];
            }
            sumOfMoney[customer] = tempMoney;
        }
        int maxAmount = maxAmount(sumOfMoney);
        System.out.println(maxAmount);
    }
    public static int maxAmount(int[] sumOfMoney) {
        int max = Integer.MIN_VALUE;
        for (int element : sumOfMoney) {
            if(max < element){
                max = element;
            }
        }
        return max;
    }
}