/*
Solving Fibonacci Sequence by tabulation technique
*/
#include <bits/stdc++.h>s
using namespace std;

long long fibonacci(int n)
{
   int lookup[n+1];
   lookup[0]=0; lookup[1]=1;
   for(int i=2;i<=n;i++)
   {
       lookup[i]=lookup[i-1]+lookup[i-2];
   }
   return lookup[n];
}
int main()
{
    int n=40;
    cout<<"The fibonacci of "<<n<<" is "<<fibonacci(n);
    return 0;
}
