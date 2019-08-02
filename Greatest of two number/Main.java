#include<stdio.h>
int main()
{
  int num1,num2;
  scanf("%d %d",&num1,&num2);
  if(num2>num1)
    printf("num2 is the greatest");
  else
    printf("num1 is the greatest");
  return 0;
}