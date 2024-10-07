// Method 1

// #include <iostream>
// using namespace std;

// int main() {
//     int n, ans = 0;
//     int a[] = {5, 4, 3, 2, 1};

//     cin >> n;

//     for (int i = 0; i < 5; i++) {
//         ans += n / a[i];
//         n = n % a[i]; 
//     }

//     cout << ans << endl; 
//     return 0;
// }



// Alias Method

#include <iostream>
using namespace std;

int main() {
    int x;
    
    cin>>x;
    cout<<(x+4)/5;
}


// Calculation for alias method

// 11 -> 3
// 11 + 4 = 15 / 5 => 3

// 14 -> 3
// 14 + 4 = 18 / 5 => 3