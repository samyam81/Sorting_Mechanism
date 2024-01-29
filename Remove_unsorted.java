import java.util.HashSet;

public class Remove_unsorted {
    public static void main(String[] args) {
        int[] arr={1,4,2,3,5};
        sorting(arr);
    }

    private static void sorting(int[] arr) {

      HashSet<Integer> uniqueSet = new HashSet<>();
      for (int i = 0; i < arr.length-1; i++) {
        if (arr[i]<arr[i+1]) {
            uniqueSet.add(arr[i]);
        }
      }

      if(arr[arr.length-1]>arr[arr.length-2])
            uniqueSet.add(arr[arr.length-1]);

      for(int num: uniqueSet)
            System.out.println(num);
    }
    
}