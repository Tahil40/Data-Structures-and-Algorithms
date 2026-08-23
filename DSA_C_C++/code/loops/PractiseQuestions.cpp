#include<iostream>
using namespace std; 

int main(){
    // practise question 1 -> print square pattern.
    for(int i=1; i<=4; i++){
        cout<<"****"<<endl;
    };

    // practise question 2 -> print sum of digit of the number.
    int number;
    cout<<"Enter the Number; ";
    cin>>number;

    int last_digit; 
    int sum = 0; 
    while(number>0){
        // first store last digit....
        last_digit = number % 10;
        // then remove that last digit from the number....
        number = number / 10; 
        sum = sum + last_digit;  
    };
    cout<<"The Sum is; "<<sum<<endl;

    // practise question 3 -> print sum of odd digit of the numbers.
    int number;
    cout<<"Enter the Number; ";
    cin>>number;

    int last_digit; 
    int sum = 0; 
    while(number>0){
        // first store last digit....
        last_digit = number % 10;
        // then remove that last digit from the number....
        number = number / 10; 
        if(last_digit % 3 == 0){
            sum = sum + last_digit;  
        };
    };
    cout<<"The Sum is; "<<sum<<endl;

    // practise question 4 -> reverse the digits of the number.
    int number;
    cout<<"Enter the Number; ";
    cin>>number;

    int last_digit;
    while(number>0){
        // first store last digit....
        last_digit = number % 10;
        // then remove that last digit from the number....
        number = number / 10; 
        cout<<last_digit;
    };
    cout<<endl;

    return 0; 
}