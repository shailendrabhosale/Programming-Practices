#include<iostream.h>
using namespace std

int main() {
    bool isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        long long reversed = 0;
        long long temp = x;

        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return (reversed == x);
    }
    cout<< "Enter no. to check for palindrome: ";
    cin>> x;
    cout<< "Palindrome: \t";
    isPalindrome(x);
};
