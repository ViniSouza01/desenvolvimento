#include<stdio.h>
#include<locale.h>
void decBin(int n);
int main (int aegc, char *argv[]){
	setlocale(LC_ALL,"");
	int num;
	printf("Digite um número inteiro para ser convertido de decimal para binário:\n");
	scanf("%d",&num);
	decBin(num);
	return 0;
}
//função que converte um número inteiro em binário
void decBin(int n){
	int bin = 0;
	do{
		bin = n % 2;
		printf("%d - %d\n",n, bin);
		n = n / 2;
		bin = n % 2;
	}while(n > 1);
	printf("O número %d em binário é %d", n, bin);
}

