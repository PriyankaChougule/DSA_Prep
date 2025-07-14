public class minAndMaxElements {

    public static void main(String[] args) {
        int[] array = {10,-3,5,6,7};
        int length = array.length;

        minAndMaxElements(array, length);
    }

    static void minAndMaxElements(int[] array, int length) {

        int min_ele = array[0];
        int max_ele = array[0];

        for(int i=0; i<array.length; i++) {
            if(array[i] < min_ele)
                min_ele = array[i];

            if(array[i] > max_ele)
                max_ele = array[i];
        }

        System.out.println("Max element: " + max_ele);
        System.out.println("Min element: " + min_ele);
    }
}
