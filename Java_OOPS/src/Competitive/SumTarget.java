package Competitive;

import java.util.HashSet;

public class SumTarget {
    /*
    @Author Santhosh
    Finding wether a sum of any pair in the array sum upto the target
     */
    public static boolean findTheTargetPresentForUnSortedArray(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: arr) {
            int diffrence = target - num;
            if(set.contains(diffrence)) {
                return true;
            } else {
                set.add(num);
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[] unsortedArr = {1,4,2,6,7,9,3};
        int[] sorted = {1,4,5,6,7,8,9,10};
        int target = 13;
        if(findTheTargetPresentForUnSortedArray(unsortedArr, target)) {
            System.out.println("The Sum is found");
        } else {
            System.out.println("The Sum is not found");
        }
    }
}
