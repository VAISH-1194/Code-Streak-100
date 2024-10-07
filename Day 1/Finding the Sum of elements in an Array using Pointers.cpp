Finding the Sum of elements in an Array using Pointers


#include <iostream>
using namespace std;

void sum(int *arr, int n)
{
    int total = 0;
    
    for (int i = 0; i < n; i++)
    {
        total += *(arr + i);
    }
    
    cout << total;
}

int main()
{
    int n;
    cin >> n;

    int arr[n];
    for (int i = 0; i < n; i++)
        cin >> arr[i];

    cout << "Sum: ";
    sum(arr, n);
    cout << endl;

    return 0;
}
