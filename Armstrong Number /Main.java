#include <stdio.h>
int main() {
int n,d,sum=0,count=0,m;
  scanf("%d",&n);
  m = n;
  while(m!=0) {  
    m=m/10;
    count++;
  }
  m = n;
  while(m!=0) {
  d = m%10;
   sum = sum+ pow(d,count);
    m = m/10;
  }
  if(sum==n)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	return 0;
}