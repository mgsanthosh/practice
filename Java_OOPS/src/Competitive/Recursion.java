package Competitive;

public class Recursion {


    static int functionInstance = 0;

    public static int getFactorialRecursively(int number){
        System.out.println("THE NUMBER "+ number);
        if (number <= 1){
            return 1;
        }
        else {
            return getFactorialRecursively(number - 1) * number;
        }
    }

    static int recursion(int val, String iterator) {
        System.out.println("THE VAL IS " + val + " FROM " + iterator);
        if(val <= 1) {
            return val;
        }
        int lastval = recursion(val - 1, "FIRST ITERATION");
        System.out.println("THE ORGINAL VAL " + val);
        int forstVal = recursion(val - 2, "SECOND ITERATOR");




            return lastval + forstVal;

    }
    public static void main(String[] args) {
        recursion(5, "root");
//        System.out.println(getFactorialRecursively(5));;
    }
}
