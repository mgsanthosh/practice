package Competitive;

public class MinMaxGame {

    static int minMaxGame(int[] nums) {
        int[] newNums = new int[nums.length/2];
        for(int i = 0;i<nums.length/2; i++) {
            if(i % 2 ==0) {
                newNums[i] = Integer.min(nums[2*i], nums[2 * i + 1]);
            } else {
                newNums[i] = Integer.max(nums[2*i], nums[2 * i + 1]);
            }
        }
        if(nums.length > 1) {
           return minMaxGame(newNums);
        } else {
            return nums[0];
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3};
        System.out.println(minMaxGame(nums));
    }
}
