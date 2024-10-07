#include <iostream>
#include <vector>

using namespace std;

int main()
{
    int n, p;
    cin >> n;

    vector<int> f(n+1); 
    
    for (int i = 1; i <= n; ++i)
    {
        cin >> p;
        f[p] = i;
    }

    for (int i = 1; i <= n; i++)
    {
        cout << " " << f[i];
    }
    cout << endl;

    return 0;
}
