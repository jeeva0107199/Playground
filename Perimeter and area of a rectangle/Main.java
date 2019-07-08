#include<stdio.h>
int main()
{
  int length;          
int breadth;         

int area;           
int perimeter;      
length = 6;
breadth = 9;

    perimeter = 2*(length + breadth);
	printf("The perimeter of the rectangle is: %d cm \n", perimeter);
	
	area = length * breadth;
	printf("The area of the rectangle is: %d sq cm \n", area);
  return 0;
}