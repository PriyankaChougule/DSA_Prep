import java.util.Arrays;

public class Max3ElementsInArray {

    //asked in Goldman Sachs
    //Try to do it in One Pass
    //One Pass, TC: O(N)

    public static void main(String[] args) {
        int[] array = {1000, 200, -1, 89, 670, 100, 500, 7000};
        findMax3ElementsInArray(array);
    }

    static void findMax3ElementsInArray(int[] array) {
        /*
        //1. Sort Array
        Arrays.sort(array);
        System.out.println("first max: "+array[array.length - 1]);
        System.out.println("second max: "+array[array.length - 2]);
        System.out.println("third max: "+array[array.length - 3]);

        //TC: O(NlogN)
        //SC: O(1)*/

        //2. One Pass
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for(int i = 0; i<array.length; i++) {
            if(max1 < array[i]) {
                max3 = max2;
                max2 = max1;
                max1 = array[i];
            }
            else if(max2 < array[i]) {
                max3 = max2;
                max2 = array[i];
            }
            else if (max3 < array[i])
                max3 = array[i];
        }

        System.out.println("Max1: "+max1);
        System.out.println("Max2: "+max2);
        System.out.println("Max3: "+max3);

        //TC: O(N)
        //SC: O(1)
    }
}
