package Competitive;
import java.util.ArrayList;
import java.util.Scanner;

public class SeqencialSearch {
    public static int doSequentialSearch(ArrayList<Integer> arr, int target) {
        for(int i = 0; i<arr.size();i++) {
            if(arr.get(i) == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number of Elements");
        int n = scanner.nextInt();
        for(int i = 0;i<n;i++) {
            System.out.println("Enter the " + i + " th element");
            int element = scanner.nextInt();
            arrayList.add(element);
        }

        while(scanner.hasNext()) {
            int target = scanner.nextInt();
            int res = doSequentialSearch(arrayList, target);
            if(res != -1) {
                System.out.println("ELEMENT PRESENT AT INDEX " + res);
            } else {
                System.out.println("ELEMENT NOT PRESENT");
            }
        }
    }
}
