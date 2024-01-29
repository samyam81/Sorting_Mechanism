import java.util.Arrays;
import java.util.Random;

public class BogoSort {
   public static void main(String[] args) {
    int[] arr={1,49,7,5,6,9,32};
    bogosort(arr);
    System.out.println(Arrays.toString(arr));
   }

private static void bogosort(int[] arr) {
     int iterations = 0;
    while (!isSorted(arr)) {
        shuffle(arr);
        iterations++;
    }
     System.out.println("Number of iterations: " + iterations);
}

private static void shuffle(int[] arr) {
     Random random = new Random();
     for (int i = 0; i < arr.length; i++) {
        int rand= random.nextInt(arr.length);
        int j = rand % arr.length;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

private static boolean isSorted(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i + 1]) {
            return false;
        }
    }
    return true;
}

}
