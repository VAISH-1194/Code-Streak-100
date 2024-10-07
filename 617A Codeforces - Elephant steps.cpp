QUESTION:

An elephant decided to visit his friend. It turned out that the elephant's house is located at point 0 and his friend's 
house is located at point x(x > 0) of the coordinate line. In one step the elephant can move 1, 2, 3, 4 or 5 
positions forward. Determine, what is the minimum number of steps he need to make in order to get to his friend's house.

Input
The first line of the input contains an integer x (1 ≤ x ≤ 1 000 000) — The coordinate of the friend's house.

Output
Print the minimum number of steps that elephant needs to make to get from point 0 to point x.

Examples
InputCopy
5
OutputCopy
1

ANSWER:

Method 1

#include <iostream>
using namespace std;

int main() {
    int n, ans = 0;
    int a[] = {5, 4, 3, 2, 1};

    cin >> n;

    for (int i = 0; i < 5; i++) {
        ans += n / a[i];
        n = n % a[i]; 
    }

    cout << ans << endl; 
    return 0;
}



Alias Method

#include <iostream>
using namespace std;

int main() {
    int x;
    
    cin>>x;
    cout<<(x+4)/5;
}


Calculation for alias method

11 -> 3
11 + 4 = 15 / 5 => 3

14 -> 3
14 + 4 = 18 / 5 => 3
