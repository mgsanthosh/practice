package Competitive;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class SelectionSort {

    public static int[] selectionSort(int[] arrayList) {
        int min_idx = 0;
        for(int i = 0; i<arrayList.length -1; i++) {
            min_idx = i;
            for (int j = i + 1; j<arrayList.length;j++) {
                if(arrayList[i] > arrayList[j]) {
                    min_idx = j;

                }
            }
            int temp = arrayList[min_idx];
            arrayList[min_idx] = arrayList[i];
            arrayList[i] = temp;

//            arrayList.set(i, arrayList.get(min));
//            arrayList.set(temp, arrayList.get(temp));

        }
        return arrayList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selection SORT");
        int n = scanner.nextInt();
        int[] arrayList = new int[n];
        for(int i = 0; i<n;i++) {
            arrayList[i] = scanner.nextInt();
        }
        int[] resArr = selectionSort(arrayList);
        for(int k = 0; k<resArr.length;k++) {
            System.out.println(resArr[k]);
        }

    }
}
