# include <iostream>
using namespace std;

int main() {

  int op;
  float n1, n2;

    do{
      cout << "Enter two operands: ";
      cin >> n1 >> n2;

      cout << "\t*MENU*\n\t1) Addition\n\t2) Substraction\n\t3) Multiplication\n\t4) Division\n\t5) Exit\nEnter your choice: ";
      cin >> op;

      switch(op) {

        case 1:
          cout << n1 << " + " << n2 << " = " << n1 + n2 << endl;
          break;

        case 2:
          cout << n1 << " - " << n2 << " = " << n1 - n2 << endl;
          break;

        case 3:
          cout << n1 << " * " << n2 << " = " << n1 * n2 << endl;
          break;

        case 4:
          cout << n1 << " / " << n2 << " = " << n1 / n2 << endl;
          break;

        case 5:
          cout << " Coming out!!! " << endl;
          break;

        default:
          cout << "Incorrect choice!";
          break;
      }
    }while(op!=5);

  return 0;
}
