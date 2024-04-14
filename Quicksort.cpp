#include <iostream>
#include <vector>

using namespace std;

int partition(vector<int>& arr, int low, int high) {
    int pivot = arr[high];
    int i = low - 1;

    for (int j = low; j < high; j++) {
        if (arr[j] <= pivot) {
            i++;
            swap(arr[i], arr[j]);
        }
    }
    swap(arr[i + 1], arr[high]);
    return i + 1;
}

void quickSort(vector<int>& arr, int low, int high) {
    if (low < high) {
        int pi = partition(arr, low, high);
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}

int main() {
    vector<int> arr = {12, 5, 7, 3, 8, 10, 1};

    for (int num : arr) {
        cout << num << " ";
    }
    cout << endl;

    int n = arr.size();
    quickSort(arr, 0, n - 1);

    for (int num : arr) {
        cout << num << " ";
    }
    cout << endl;

    return 0;
}
