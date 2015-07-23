#include<stdio.h>
int main()
{
	int a[10];
	void judge(int array[]);
	printf("请向数组中输入若干四级成绩\n");
	for(int i=0;i<10;i++)
	{
		scanf("%d",&a[i]);
	}
	judge(a);
}
	

void judge(int array[10])
{
	for(int i=0;i<10;i++)
	{
		if(array[i]>425){
			printf("%d\n",array[i]);
			printf("6666\n");
		}
		else
		{
			    printf("%d\n",array[i]);
				printf("人生不易，四级还得努力\n");
		}
	}
}
    
