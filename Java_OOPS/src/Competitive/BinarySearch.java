package Competitive;
import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = 0, mid = 0;
        high = arr.length - 1;
        for(int i = 0;i<arr.length;i++) {
            mid = (low + high) / 2;
            if(arr[mid] == target) {
                return i;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n, target;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        n = scanner.nextInt();

        int [] arr = new int[n];
        for(int i = 0;i<n;i++) {
            System.out.println("ENTER THE " + i + " th element");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the target");

        while (scanner.hasNext()) {
            target = scanner.nextInt();
            int res = binarySearch(arr, target);
            if(res != -1) {
                System.out.println("THE ITEM " + target + " is present at index " + res);
            } else {
                System.out.println("THE ITEM " + target + " is not present");
            };
        }

    }
}
