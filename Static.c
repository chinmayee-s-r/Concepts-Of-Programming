#include<stdio.h>

void Marvellous(){

    static int x = 10;
    x++;
    printf("%d\n", x);
}

int main(){

    printf("Demo of Static Storage Class!\n");
    Marvellous();
    Marvellous();
    Marvellous();

    return 0;
}