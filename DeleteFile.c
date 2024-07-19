#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<fcntl.h>

int main(){

    char Name[30];
    int fd = 0;

    printf("Enter Name of File you want to DELETE : ");
    scanf("%s", Name);

    unlink(Name);

    if(fd == -1){

        printf("Unable to create file. \n");
    }
    else{

        printf("File gets created with %d. \n", fd);
    }

    return 0;
}