package Competitive;

import java.util.ArrayList;
import java.util.List;

public class Consecutive {

    public static int countConsecutivePairs(String s) {
        int consecutivePairsCount = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                consecutivePairsCount++;
            }
        }
        return consecutivePairsCount;
    }

    public static void main(String[] args) {
        String inputString = "aaccdeef";
        int result = countConsecutivePairs(inputString);
        System.out.println("Number of consecutive pairs: " + result);
    }

//    public static void main(String[] args) {
//        String name = "aabcccbvbcddcc";
//
//        int numberOfConsecutivePairs = 0;
//        String temp = "";
//
//        for (int i = 0; i < name.length() - 1; i++) {
//            int c = name.charAt(i);
//            int nextC = name.charAt(i + 1);
//            char ch = name.charAt(i);
//            temp = temp + name.charAt(i);
//            if (c + 1 != nextC) {
//                System.out.println(temp);
//                if (temp.length() > 1) {
//                    numberOfConsecutivePairs++;
//                }
//
//                temp = "";
//            }
//        }
//        System.out.println(numberOfConsecutivePairs);
//
//    }
}
