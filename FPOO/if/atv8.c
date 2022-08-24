#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int a,b;
	//entradas
	printf("Digite dois números inteiros separados por espaço ou enter:\n");
	scanf("%d",&a);
	scanf("%d",&b);
	//processamento
	if(a > b){
		printf("O número %d é maior do que %d",a,b);
	}else{
		printf("O número %d é maior do que %d",b,a);
	}
}
