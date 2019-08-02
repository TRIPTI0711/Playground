#include<stdio.h>
int main()
{
int n,a,d,n_s1,n_s2,f;
  scanf("%d",&n);
  if(n%2==1)
  {
    a=0,d=2;
    n_s1=(n+1)/2;
    f=a+(n_s1-1)*d;
  printf("%d",f);
  }
  else
  {
    a=0,d=1;
    n_s2=n/2;
    f=a+(n_s2-1)*d;
    printf("%d",f);
  }
   return 0;   
}