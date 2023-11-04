package Competitive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZigZagConversion {
    static HashMap<Integer, ArrayList<Character>> map = new HashMap<>();

    static void addToMap(int index, Character val) {
            if(!map.containsKey(index)) {
                map.put(index, new ArrayList<Character>());
            }
            ArrayList<Character> arr = map.get(index);
            arr.add(val);
            map.put(index, arr);
    }

    public static void main(String[] args) {
        String str = "AB";
        int num = 1;
        int counter = 0;
        String resultString = "";
        for(int i = 0;i<= str.length()-1;i++) {
            System.out.println("THE VALUe of" + i);
            int j;
            for (j = 0; j< num; j++) {
                System.out.println(str.charAt(counter) + " = " + j);
                addToMap(j, str.charAt(counter));
                counter++;
                if (counter > str.length() -1) {
                    break;
                }
            }
            j = j -1;
            for (int k = 1; k<=num/2;k++) {
                if (counter > str.length() -1) {
                    break;
                }
                System.out.println(str.charAt(counter) + " = " + (j - k));
                addToMap(j - k, str.charAt(counter));

                counter++;
            }
            i = counter;

        }

        System.out.println(map.get(0));
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));

        for(Map.Entry<Integer, ArrayList<Character>> entry: map.entrySet()) {
            System.out.println(entry.getValue());
            ArrayList<Character> temp = entry.getValue();
            for(int i = 0;i<temp.size(); i++) {
                resultString = resultString + temp.get(i);
            }
        }
        System.out.println(resultString);
    }
}
