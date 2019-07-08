#include<stdio.h>
int main()
{
int n;
  float r, area;
  float pi;
  scanf("%d",&n);
  r=(float)n/2;
  pi=3.14;
  area=pi*r*r;
  float f= area;
  printf("%.2f",area);
  return 0;
}