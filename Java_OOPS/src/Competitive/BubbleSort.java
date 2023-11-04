package Competitive;

import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSort {
    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> arrayList)  {
        for (int i = 0; i<arrayList.size();i++) {
            for (int j = i; j<arrayList.size() -1;j++) {
                if(arrayList.get(j)  > arrayList.get(j + 1)) {
                    int temp = arrayList.get(j + 1);
                    arrayList.set(j +1, arrayList.get(j));
                    arrayList.set(j, temp);
                }
            }
        }
        return arrayList;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("BUBBLE SORT");
        int n = scanner.nextInt();
        for(int i = 0; i<n;i++) {
            int val = scanner.nextInt();
            arrayList.add(val);
        }
        System.out.println(bubbleSort(arrayList));

    }
}
