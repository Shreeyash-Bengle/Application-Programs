#include<stdio.h>

#pragma pack(1)
struct Demo
{
    int no;
    char ch;
    float f;
    int i;
};

int main()
{
    struct Demo obj;

    printf("%d\n",sizeof(obj));
    
    return 0;
}


// #pragma pack(1),(2),(4),(8)
// in concept of padding we can only give (1,2,4,8) values
// in case we give the values other than this the values 
// gets ignored ...