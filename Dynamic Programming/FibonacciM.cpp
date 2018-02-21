/*
Solving Fibonacci Sequence by memoization technique
*/
#include <bits/stdc++.h>s
using namespace std;

int lookup[10000];

void _initialise()
{
    memset(lookup,-1,sizeof(lookup)/sizeof(int));
}
long long fibonacci(int n)
{
    if(lookup[n]==-1)
    {
        if(n<=1)
            lookup[n] = n;
        else
            lookup[n]=fibonacci(n-1)+ fibonacci(n-2);
    }
   return lookup[n];
}
int main()
{
    _initialise();
    int n=40;
    cout<<"The fibonacci of "<<n<<" is "<<fibonacci(n);
    return 0;
}
