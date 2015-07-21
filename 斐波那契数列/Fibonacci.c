#include<stdio.h>
int main()
{
    int b;
    scanf("%d",&b);
    printf("%d\n",f1(b));
}
int f1(int a)
{
	if(a==1)
		return 0;
	else if(a==2)
		return 1;
	else
		return f1(a-2)+f1(a-1);
}