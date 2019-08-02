#include<stdio.h>
int main()
{
  int n,i,el1,el2,el1_i=-1,el2_i=-1;
  scanf("%d",&n);
  int arr[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  scanf("%d%d",&el1,&el2);
  for(i=0;i<n;i++)
  {
    if(el1==arr[i] && el1_i==-1) 
    {
      el1_i=i;
    }
  
  if(el2==arr[i] && el2_i==-1) 
  {
    el2_i=i;
  }
  }
  
  printf("Element 1 index = %d\nElement 2 index = %d",el1_i,el2_i);
  return 0;
}