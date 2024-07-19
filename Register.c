#include<stdio.h>

void Marvellous(){

    int i = 11;
    register int j = 21;
    register int k;

    printf("%d\n", k);
}

int main(){

    printf("Demo of Register Storage Class!\n");
    Marvellous();

    return 0;
}