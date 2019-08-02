#include <stdio.h>
int main() {
char ch;
   scanf("%c", &ch);
   if('a' <=  ch && ch <= 'z')
   {
      printf("%c", ch-32);
   }
  else if('A' <=  ch && ch <= 'Z')
   {
      printf("%c", ch+32);
   }
   else
   {
      printf("Entered character %c is a special character", ch);
   }
	return 0;
}