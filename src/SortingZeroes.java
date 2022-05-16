import java.util.Arrays;


public class SortingZeroes {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int[] array = {-1, 2, 0, 4, 5, 6, 0, 0, 0};
        System.out.println("Your array is:        " + Arrays.toString(array));
        System.out.println("Your sorted array is: " + Arrays.toString(putZeroesInPlace(array)));
        long end = System.currentTimeMillis();
        System.out.println("Sorting Time: " + (end - start));

    }

    public static int[] putZeroesInPlace(int[] array) {
        Arrays.sort(array);
        int[] sortedArray = new int[array.length];
        int j = 0;
        int k = 0;
        for (int value : array) {
            if (value == 0) {
                sortedArray[j] = value;
                j++;
            } else {
                sortedArray[array.length - 1 - k] = value;
                k++;
            }
        }


        return sortedArray;

    }


}
