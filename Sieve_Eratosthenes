/* Implementation of Sieve of Erathostenes to
find out all prime numbers under a number
good for small uppper bound */
#include <bits/stdc++.h>

using namespace std;

int main()
{
    int t,n;
    cin>>t;
    while(t--)
    {
        cin>>n;
        bool isComposite[n+1];
        memset(isComposite,false,sizeof(isComposite));
        for(int i=2;i<=sqrt(n);i++)
        {
            if(!isComposite[i])
            {
                for(int j=i*i;j<=n;j+=i)
                    isComposite[j]=true;
            }
        }

        cout<<"All prime numbers till "<<n<<" : ";
        for(int i=2;i<n;i++)
        {
            if(!isComposite[i])
                cout<<i<<" ";
        }
    }
    return 0;
}
