import java.util.Random;
public class sortb{
    public static void main(String[] args) {
        int[] arr=new int[10]; 
         Random random = new Random();
         // generate a random array;
        for(int i=0;i<10;i++){
            arr[i]=random.nextInt();
         }
           System.out.println("the Array before sorting is;");
        printarray(arr);
        // Sorting of the array
        bubble(arr);
        //printing the aray
        System.out.println("the Array after sorting is;");
        printarray(arr);
    }
    private static void bubble(int[] arr) {
        int temp,n=10;
        for(int i=0;i<n-1;i++)
        {
            for (int j=0;j<n-i-1;j++)
            {
                if (arr[j]<arr[j+1])
                {
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void printarray(int arr[]){
        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }
    }
}
