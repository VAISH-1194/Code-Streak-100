Reversing the elements in an array

#include <iostream>
using namespace std;

void reverseList(int *arr, int n)
{
    int* start = arr;
    int* end = arr + n - 1;

    while (start < end)
    {
        swap(*start, *end);
        start++;
        end--;
    }
}

int main()
{
    int n;
    cin >> n;

    int arr[n];
    for (int i = 0; i < n; i++)
        cin >> arr[i];

    reverseList(arr, n);

    cout << "Reversed array: ";
    for (int i = 0; i < n; i++)
        cout << arr[i] << " ";

    cout << endl;
    return 0;
}
