import java.util.Random;

public class sortSel{
public static void main(String[] args) {
        int[] arr= new int[10];
        cin(arr);
        System.out.println("The Array before sorting is");
        cout(arr);
        Selectionsort(arr,10);
        System.out.println("The Array After sorting is");
        cout(arr);
    } 
private static void Selectionsort(int[] arr, int n) {
        for(int i=0;i<n-1;i++){
            int min=i;
            for( int j=i+1;j<n;j++){
                 if (arr[j]<arr[min])
                    min=j;
            }
              int temp1=arr[i];
              arr[i]=arr[min];
              arr[min]=temp1; 
        }
    }
private static void cout(int[] arr) {
        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }
    }
private static void cin(int[] arr) {
          Random random = new Random();
         // generate a random array;
        for(int i=0;i<10;i++){
            arr[i]=random.nextInt();
         }
    }
}
