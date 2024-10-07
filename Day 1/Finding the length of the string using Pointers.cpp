Finding the length of the string using Pointers


#include <iostream>
using namespace std;

int len(char *str)
{
   int length = 0;
   while(*(str++))
   {
     length++;
   }
   
   return length;
}

int main()
{
    char a[] = "Vaish";
    cout <<len(a);

    return 0;
}
