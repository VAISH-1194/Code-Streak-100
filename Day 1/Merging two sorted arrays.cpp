//Merging two sorted arrays


#include <iostream>
#include <algorithm>
using namespace std;

void merge(int* arr1, int n1, int* arr2, int n2, int* arr3)
{
    int i = 0, j = 0, k = 0;

    while (i < n1) {
        arr3[k++] = arr1[i++];
    }

    while (j < n2) {
        arr3[k++] = arr2[j++];
    }

    sort(arr3, arr3 + n1 + n2);
}

int main() {
    int n1, n2;
    
    cin >> n1;
    int* arr1 = new int[n1];
    
    for (int i = 0; i < n1; i++) {
        cin >> arr1[i];
    }

    cin >> n2;
    int* arr2 = new int[n2];

    for (int i = 0; i < n2; i++) {
        cin >> arr2[i];
    }

    int* arr3 = new int[n1 + n2];

    merge(arr1, n1, arr2, n2, arr3);

    cout << "Merged and sorted array: ";
    for (int i = 0; i < n1 + n2; i++)
        cout << arr3[i] << " ";

    delete[] arr1;
    delete[] arr2;
    delete[] arr3;

    return 0;
}


