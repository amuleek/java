# include<iostream>
using namespace std;
class Account
{
int acc_no;
public:
float balance;
void initialize(int x, int y)
{
acc_no=x;
balance=y;
}
int get_accno()
{
return acc_no;
}
} ;
class Saving_acc : public Account
{
float interest_rate;
public : //constructor of Saving_acc
Saving_acc(float c)
{
interest_rate=c;
}
void display ()
{
cout<<"account number "<<get_accno(); // acc_no is private to Saving_acc
cout<<"\n""revised balance "<<balance*interest_rate<<"\n";//balance is public to Saving_acc
}
};
int main()
{
Saving_acc S(0.07); //constructor of Saving_acc initialized
S.initialize(24494, 6000); // object of Saving_acc class called //the member function of Account class
S.display();
return 0;
}
