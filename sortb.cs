using System;

class Program
{
    static void BubbleSort(int[] arr)
    {
        int n = arr.Length;
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                if (arr[j] < arr[j + 1])
                {
                    // Swap elements if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void PrintArray(int[] arr)
    {
        foreach (int num in arr)
        {
            Console.WriteLine(num);
        }
    }

    static void Main(string[] args)
    {
        int[] arr = new int[10];
        Random rand = new Random();

        // Generate a random array
        for (int i = 0; i < 10; i++)
        {
            arr[i] = rand.Next();
        }

        Console.WriteLine("The array before sorting is:");
        PrintArray(arr);

        // Sorting the array
        BubbleSort(arr);

        Console.WriteLine("The array after sorting is:");
        PrintArray(arr);
    }
}
