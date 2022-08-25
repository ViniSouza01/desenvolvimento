#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int n,i;
	
	printf("digite algum número:\n");
	scanf("%d",&n);
	
	if(n % 2 == 0){
		printf("é par");
	}else{
		printf("É ímpar");
	}
}
