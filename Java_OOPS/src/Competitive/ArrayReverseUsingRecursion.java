package Competitive;

public class ArrayReverseUsingRecursion {

    public static int[] reverseArray(int[] arr, int itr, int starter) {

        if(starter > itr/2) {
            return arr;
        }
        int temp = arr[itr - starter];
        arr[itr - starter] = arr[starter];
        arr[starter] = temp;
        starter = starter + 1;
        return reverseArray(arr, itr, starter);
    }
    public static void main(String[] args) {
        int[] array = new int[]{2,1,4,6,7};
        int[] result = reverseArray(array, array.length - 1 , 0);
        for (int i = 0; i<result.length;i++) {
            System.out.println(result[i]);

        }

    }
}
