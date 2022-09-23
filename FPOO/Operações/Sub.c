#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int a,b,c;
	printf("Digite um número inteiro: ");
	scanf("%d",&a);
	printf("Digite outro número inteiro: ");
	scanf("%d",&b);
	c = a - b;
	printf("O resultado da operação é: %d", c);
}
