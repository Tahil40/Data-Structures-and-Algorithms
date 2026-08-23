#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    int number;
    cout << "Enter the Number; ";
    cin >> number;

    if (number == 2)
    {
        cout << "The Number is Prime" << endl;
    }
    else
    {
        bool isPrime = false;
        for (int i = 2; i <= sqrt(number); i++)
        {
            if (number % i == 0)
            {
                isPrime = false;
            };
        };

        if (isPrime == true)
        {
            cout << "The Number is Prime" << endl;
        }
        else
        {
            cout << "The Number is Composite" << endl;
        };
    }

    return 0;
};