public class ReverseArrayInPlace {

    public static void main(String[] args) {
        int[] a = {10,20,3,4,80,1};
        reverseArray(a);
    }

    static void reverseArray(int[] a) {
        int temp;
        int size = a.length;

        for(int i=0; i<size/2; i++) {
            temp  = a[i];
            a[i] = a[size-i-1];
            a[size-i-1] = temp;
        }

        for(int i : a)
            System.out.println(i);


        //TC: O(N/2)
        //SC: O(1)
    }
}
