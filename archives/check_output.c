#include <stdio.h>
#include <string.h>

int main() {
unsigned int num;
int i;
scanf("%u", &num);
for(i = 0; i < 16; i++)
	printf("%d",(num<<i & 1 <<15) ? 1 : 0 );	
}
