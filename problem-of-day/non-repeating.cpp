#include <bits/stdc++.h>
using namespace std;

int main() {
    // Write C++ code here
int arr[]={-1 ,-17 ,-12 ,8 ,16, -17, -13 ,-14 ,-3 ,-6 ,-5,-11 ,-10 ,-12, -5 ,19 ,-17 ,-5 ,-1 ,12};
    int n=20;
   unordered_map<int,int>m;
   for(int i=0;i<n;i++)
   {
       m[arr[i]]++;
   }
   for(int i=0;i<n;i++)
   {
      if(m[arr[i]]==1)
      {
       cout<<arr[i]<<endl;
        
      }
   }
        

    return 0;
}