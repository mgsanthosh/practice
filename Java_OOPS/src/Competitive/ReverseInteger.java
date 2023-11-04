package Competitive;

public class ReverseInteger {

    public int reverse(int x) {
        int resNum = 0;
        while(x != 0) {
            int temp = x % 10;
            // Checking for 32 bit signed integer leetcode
            if (resNum > Integer.MAX_VALUE/10 || (resNum == Integer.MAX_VALUE / 10 && temp > 7)) return 0;
            if (resNum < Integer.MIN_VALUE/10 || (resNum == Integer.MIN_VALUE / 10 && temp < -8)) return 0;
            resNum = (resNum * 10) + temp;
            x = x / 10;

        }
        return resNum;
    }

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.reverse(321));

    }
}
