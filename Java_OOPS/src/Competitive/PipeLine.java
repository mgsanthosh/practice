package Competitive;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
// Uncomment below classes to send network request if needed.
// import java.net.HttpURLConnection;
// import java.net.URL;

class PipeLine {
    static Map<String , Integer> frequencyMap = new HashMap<>();
    static List<String> allValue = new ArrayList<String>();
    public static void main(String[] args ) throws Exception {
        StringBuilder inputData = new StringBuilder();
        String thisLine = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while ((thisLine = br.readLine()) != null) {
            if(thisLine.toString() == "STOP") {
                br.close();
            }
            inputData.append(thisLine + "\n");
        }
        // Output the solution to the console
        System.out.println(codeHere(inputData));
    }
    public static void insert(String val) {
        int count = 1;
        if(frequencyMap.containsKey(val)) {
            count = frequencyMap.get(val) + 1;
            frequencyMap.put(val, count);
        } else {
            frequencyMap.put(val, count);
        }
    }

    public static ArrayList<String> findHighestFrequency() {
        int max = 0;
        int index = 0;
        ArrayList<String> strList = new ArrayList<String>();
        for(Map.Entry<String, Integer> map: frequencyMap.entrySet()) {
            if(map.getValue() >= max) {
                max = map.getValue();
            }
        }
        for (Map.Entry<String, Integer> map : frequencyMap.entrySet()) {
            if (map.getValue() == max) {
                strList.add(map.getKey());
            }
        }
        return strList;
    }

    public static int findTheClosestElementToPipe(ArrayList<String> elements) {
        ArrayList<Integer> occ = new ArrayList<>();
        for(int i = 0; i < allValue.size(); i++) {
            if(elements.contains(allValue.get(i))) {
                occ.add(i);
            }
        }

        return Collections.max(occ);
    }


    public static void remove() {
        ArrayList<String> removableElements = findHighestFrequency();
        int va = findTheClosestElementToPipe(removableElements);
        String rem = allValue.get(va);
        int count = frequencyMap.get(rem);
        allValue.remove(va);
        frequencyMap.put(rem, count);
    }
    public static String codeHere(StringBuilder inputData) {
        // Use this function to write your solution;
        String[] data = inputData.toString().split("\n");

        for(int i = 1 ;i<data.length;i++) {
            String[] inputs = data[i].split(" ");
            if(inputs[0].equals("1")) {
                allValue.add(inputs[1]);
                insert(inputs[1]);
            } else {
                remove();
            }
        }
        StringBuilder answer = new StringBuilder();

        for(int i = 0;i<allValue.size() - 1;i++) {
            answer.append(allValue.get(i) + " ");
        }

        return answer.toString();

    }
}