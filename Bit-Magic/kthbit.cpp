// check kth bit is set or not 
/*
 k=3
 n=5  => 0000--------101
 true if kth bit is set 



 // answer logic is 

 set all bit zero accept  kth bit 
 how can we do 

 00000----101
 now left shift 1 with  k-1  => 00000-----100
 now perform and operator &
*/
#include<iostream>
using namespace std;
int main ()
{
    int n=5;
    int k=3;
    
    if(n &(1<<(k-1))!=0)
    cout<<" kth bit set";
    else
    cout<<" kth bit not set";
    
}