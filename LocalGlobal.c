#include<stdio.h>

int X =101;

void Marvellous(){

    int i = 21;
    int no = 51;

    printf("From Marvellous value of no is : %d\n", no);
    printf("From Marvellous value of i is : %d\n", i);
    printf("From Marvellous value of X is : %d\n", X);

}

int main(){

    int no = 11;
    
    printf("From main value of no is : %d\n", no);
    printf("From main value of x is : %d\n", X);

    Marvellous();

    return 0;
}