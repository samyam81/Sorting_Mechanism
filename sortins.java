import java.util.Random;

public class sortins {
public static void main(String[] args) {
        int[] arr= new int[10];
        cin(arr);
        System.out.println("The Array before sorting is");
        cout(arr);
        Insertionsort(arr,10);
        System.out.println("The Array After sorting is");
        cout(arr);
    }
private static void Insertionsort(int[] arr,int n) {
        for(int i=0;i<n;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
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
