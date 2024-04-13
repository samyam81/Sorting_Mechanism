#include <iostream>
#include <cstdlib>
#include <ctime>

using namespace std;

void bubbleSort(int arr[], int n) {
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] < arr[j + 1]) {
                // Swap elements if they are in the wrong order
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

void printArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        cout << arr[i] << endl;
    }
}

int main() {
    int arr[10];
    srand(time(0));

    // Generate a random array
    for (int i = 0; i < 10; i++) {
        arr[i] = rand();
    }

    cout << "The array before sorting is:" << endl;
    printArray(arr, 10);

    // Sorting the array
    bubbleSort(arr, 10);

    cout << "The array after sorting is:" << endl;
    printArray(arr, 10);

    return 0;
}
