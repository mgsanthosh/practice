package Competitive;

public class O1Sorting10 {

    public static void main(String[] args) {
        int arr[] = {0,1,1,0,1,0};
        int low = 0;
        int high = arr.length - 1;
        for(int i = 0;i<arr.length;i++) {
            if(arr[low] > arr[high]) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                high = high - 1;
            } else if (arr[low] == arr[high]) {
                high = high - 1;
            }else {
                low = low + 1;
            }
        }
        System.out.println("THE RESULT IS");
        for(int i = 0;i<arr.length;i++) {
            System.out.print(arr[i] + " - ");

        }
    }
}
