#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int n,i;
	
	printf("digite algum n�mero:\n");
	scanf("%d",&n);
	
	if(n % 2 == 0){
		printf("� par");
	}else{
		printf("� �mpar");
	}
}
