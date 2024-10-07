// Copying Strings Using Pointers


#include <iostream>
using namespace std;

void copy(char *src, char *des)
{
  while((*des++ = *src++));   
}

int main()
{
   char str[] = "Vaish";
    char des[100];      
    
    copy(str, des);        
    
    cout << "Copied string: " << des << endl; 
    
    return 0;
}
