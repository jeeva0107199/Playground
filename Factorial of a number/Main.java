#include<stdio.h> 
int main() 
{ 
        int num,i,f=1;
        scanf("%d",&num); 
        for(i=num;i>=1;i--) 
            { 
                 f=f*i; 
            } 
                 printf("%d",f); 
                 return 0; 
} 