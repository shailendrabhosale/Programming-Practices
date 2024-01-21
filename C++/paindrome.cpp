#include<iostream.h>
using namespace std

class Solution {
public:
    int x, n, i, t;
    bool isPalindrome() {
        cout<<"Enter a number: ";
        cin>>x; t=x;
        for(i=0; x!=0; n=n*10){
            n=n+x%10;
            x=x/10;
        }
        if(t==n)
            return true;
        else
            return false;
    }
};
