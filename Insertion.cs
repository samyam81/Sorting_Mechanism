using System;

public class SortIns
{
    public static void Main(string[] args)
    {
        int[] arr = new int[10];
        Cin(arr);
        Console.WriteLine("The Array before sorting is:");
        Cout(arr);
        InsertionSort(arr, 10);
        Console.WriteLine("The Array After sorting is:");
        Cout(arr);
    }

    private static void InsertionSort(int[] arr, int n)
    {
        for (int i = 1; i < n; i++)
        {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp)
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    private static void Cout(int[] arr)
    {
        foreach (int num in arr)
        {
            Console.WriteLine(num);
        }
    }

    private static void Cin(int[] arr)
    {
        Random random = new Random();
        for (int i = 0; i < 10; i++)
        {
            arr[i] = random.Next();
        }
    }
}
