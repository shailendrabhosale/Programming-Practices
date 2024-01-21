#include <iostream>
using namespace std;
class dist 
{
   private:
      int feet;
      int inches;
    public:
      dist() 
	{
         feet = 0;
         inches = 0;
     	 }
      dist(int f, int i) 
	{
         feet = f;
         inches = i;
     	 }
      friend ostream &operator<<( ostream &output, const dist &D ) 
	{ 
         output << "F : " << D.feet << " I : " << D.inches;
         return output;            
      	}

      friend istream &operator>>( istream  &input, dist &D ) 
	{ 
         input >> D.feet >> D.inches;
         return input;            
      }
};

int main() {
   dist D1(11, 10), D2(5, 11), D3;

   cout << "Enter the value of object : " << endl;
   cin >> D3;
   cout << "First Distance : " << D1 << endl;
   cout << "Second Distance :" << D2 << endl;
   cout << "Third Distance :" << D3 << endl;

   return 0;
}