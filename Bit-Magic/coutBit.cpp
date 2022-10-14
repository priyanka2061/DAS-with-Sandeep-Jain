/*

 cout number of set bit 
 n=7   => 0000-----------111
 coutbit =3
 solution
 brian kerningam algorithm
 soln- 
 make set bit zero 
  n=n&(n-1)

*/
#include<iostream>
using namespace std;
int main ()
{ int r;
    int n=5;
    while (n>0)
    {
        
      n=(n&(n-1));
      r++;

    }
    cout <<r;
}