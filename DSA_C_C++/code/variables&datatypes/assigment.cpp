#include<iostream>
using namespace std; 

int main(){
    // calculate are of square....
    // int side; 
    // cout<<"Enter The Side of Square: ";
    // cin>>side; 
    // cout<<"The Area of Square is; "<<side*side<<endl;

    /* 
    Enter cost of 3items from the user(using float datatype) - a pencil, a pen and an eraser.You have to output the total cost of the items back to the user as their bill.
    (Add on: You can also try adding 18% GST tax to the items in the bill as an advanced problem
    */
    float pencil, pen, eraser;
    cout<<"Enter the price of pencil: "; 
    cin>>pencil;
    cout<<endl; 
    cout<<"Enter the price of pen: ";
    cin>>pen;
    cout<<endl;
    cout<<"Enter the price of eraser: ";
    cin>>eraser;
    cout<<endl;
    
    float price = ((pencil + pen + eraser)*18)/100; 
    float actual_price = price + (pencil + pen + eraser);
    cout<<"price after 18% GST is; "<<actual_price<<endl; 

    return 0; 
};