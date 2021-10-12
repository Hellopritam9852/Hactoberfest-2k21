#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
int main()
{
    ll t;
    cin>>t;
    stack<int> st,st2;
    ll max=-1;
    while(t--)
    {
        int q,v;
        cin>>q;
        if(q==1)
        {
            cin>>v;
            st.push(v);
            st2.push(v);
            max=(st.top()>max)?st.top():max;
        }
        else if(q==2)
        {
            ll v=st.top();
            st.pop();
            
            st2.pop();
            
            if(v==max){
                max=-1;
                while(!(st2.empty()))
                {
                   max=(st2.top()>max)?st2.top():max;
                   st2.pop();
                }
                st2.push(max);
            }
        }
        else if(q==3)
        {
           cout<<max<<"\n";

        }
    }
}
