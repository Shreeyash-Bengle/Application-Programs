#include<iostream>
using namespace std;

class MarvellousArray
{
    private:
       int *Arr;
       int iSize;

       public:
         MarvellousArray(int Length)
         {
            cout<<"Inside Constructor"<<"\n";
            iSize = Length;
            Arr = new int [iSize];
         }
         ~MarvellousArray()
         {
            cout<<"inside Destructor"<<"\n";
            delete []Arr;
         }
         void Accept()
         {
            cout<<"Enter the values : "<<"\n";
            for (int i = 0; i< iSize; i++)
            {
                cin>>Arr[i];
            }
         }
         void Display()
         {
            cout<<"Elements of array are : "<<"\n";
            for(int i = 0; i< iSize; i++)
            {
                cout<<Arr[i]<<"\n";
            }
         }
       
};

int main()
{
    MarvellousArray mobj1(7);
    MarvellousArray mobj2(4);

    mobj1.Accept();
    mobj1.Display();

    mobj2.Accept();
    mobj2.Display();
    return 0;
}