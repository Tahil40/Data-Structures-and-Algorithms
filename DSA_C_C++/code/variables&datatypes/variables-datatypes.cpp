#include<iostream> 
#include<iomanip>
using namespace std; 

int main(){
    int integer_variable = 450; 
    int negative_integer_variable = -450; 
    char character_variable = 'T'; //character must be enclosed in single quotes....
    bool isAdult = false;
    float floating_variable = 45.6; //store upto 7 values after decimal.... 
    double double_variable = 95.564; //store upto 14-15 values after decimal....
    
    cout<<integer_variable<<"\n"<<negative_integer_variable<<"\n"<<character_variable<<"\n"<<isAdult<<"\n"<<floating_variable<<endl;
    cout<<"Size of: "<<integer_variable<<" => "<<sizeof(integer_variable)<<endl;
    cout<<"Size of: "<<character_variable<<" => "<<sizeof(character_variable)<<endl;
    cout<<"Size of: "<<isAdult<<" => "<<sizeof(isAdult)<<endl;
    
    cout<<"Size of integer is; "<<sizeof(int)<<endl;
    cout<<"Size of character is; "<<sizeof(char)<<endl;
    cout<<"Size of boolean is; "<<sizeof(bool)<<endl;
    cout<<"Size of floating is; "<<sizeof(float)<<endl;
    cout<<"Size of double is; "<<sizeof(double)<<endl;

    cout<<"Size of: "<<floating_variable<<" => "<<sizeof(floating_variable)<<endl; 
    cout<<"Size of: "<<double_variable<<" => "<<sizeof(double_variable)<<endl;

    // increasing cout precision....
    cout<<setprecision(7)<<"Size of: "<<floating_variable<<" => "<<sizeof(floating_variable)<<endl; 
    cout<<setprecision(12)<<"Size of: "<<double_variable<<" => "<<sizeof(double_variable)<<endl;

    return 0; 
};