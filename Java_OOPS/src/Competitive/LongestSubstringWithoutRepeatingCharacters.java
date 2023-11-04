package Competitive;

import java.util.ArrayList;

public class LongestSubstringWithoutRepeatingCharacters {

    static int findLongest(ArrayList<ArrayList<Character>> list) {
        int maxLen = 0;
        for (int i = 0;i<list.size();i++) {
            if(list.get(i).size() > maxLen) {
                maxLen = list.get(i).size();
            }
        }
        return maxLen;
    }
    static int findSubString(String s) {
        ArrayList<ArrayList<Character>> Mainlist = new ArrayList<>();
        int currentList = 0;
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0;i<s.length();i++) {
            if(list.contains(s.charAt(i))) {
                System.out.println("ADDING TO MAIN LIST " + list);
                Mainlist.add(currentList, list);
                list = new ArrayList<>();
                currentList += 1;
                list.add(s.charAt(i));
            } else {
                list.add(s.charAt(i));
            }
        }

        return findLongest(Mainlist);
    }

    public static void main(String[] args) {
        String s = " ";
        System.out.println(findSubString(s));

    }
}
