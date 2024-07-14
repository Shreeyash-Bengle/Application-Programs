#include<iostream>
using namespace std;

int StrlenX(char *str)    
{
    int iCnt = 0;

    while(*str != '\0')
    {
        str++;
        iCnt++;
    }
    return iCnt;
}

int main()
{
    char Arr[10];
    int iRet = 0;

    cout<<"Enter the Name"<<"\n";
    cin>>Arr;

    iRet = StrlenX(Arr);    //100
    cout<<"Length of Name is : "<<iRet<<"\n";

    return 0;
}


