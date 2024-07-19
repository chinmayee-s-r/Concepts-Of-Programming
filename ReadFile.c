#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<fcntl.h>

int main(){

    char Name[30];
    int fd = 0;
    int iRet = 0;
    char Data[30] = {'\0'};

    printf("Enter Name of File you want to OPEN : ");
    scanf("%s", Name);

    fd = open(Name, O_RDWR);

    iRet = write(fd, Data, 9);

    printf("%d bytes are successfully read from file \n", iRet);
    printf("%s \n", Data);
    close(fd);
    
    return 0;
}