Finding the maximum element in an Array


#include <iostream>
using namespace std;

int findMax(int *arr, int n)
{
    int max = *arr; 
    for (int i = 1; i < n; i++)
    {
        if (*(arr + i) > max) 
        {
            max = *(arr + i);
        }
    }
    return max;
}

int main()
{
    int n;
    cin >> n;
    
    int arr[n];
    
    for (int i = 0; i < n; i++)
        cin >> arr[i];

    cout << "Max: " << findMax(arr, n) << endl;

    return 0;
}



Finding the Maximum element in the array along with 
the second maximum element

#include <iostream>
using namespace std;

void findMax1AndMax2(int *arr, int n, int &max, int &Max2)
{
    if (n < 2) {
        cout << "Array must contain at least two elements." << endl;
        return;
    }

    max = Max2 = arr[0]; 

    for (int i = 1; i < n; i++)
    {
        if (*(arr + i) > max)
        {
            Max2 = max;
            max = *(arr + i); 
        }
        else if (*(arr + i) > Max2 && *(arr + i) != max)
        {
            Max2 = *(arr + i);
        }
    }
}

int main()
{
    int n;
    cin >> n;
    
    if (n < 2) {
        cout << "Array must contain at least two elements." << endl;
        return 0; 
    }

    int arr[n];
    
    for (int i = 0; i < n; i++)
        cin >> arr[i];

    int max, Max2;
    findMax1AndMax2(arr, n, max, Max2);

    cout << "Max: " << max << endl;
    cout << "Second Max: " << Max2 << endl;

    return 0;
}
