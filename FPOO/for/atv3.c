//Exercício 3
#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int i,valor = -1;
	while (valor < 0 || valor > 32767){
	printf("Digite um número inteiro entre 0 e 32767:\n");
	scanf("%d",&valor);
	}
	for (i = 0; i <= valor; i++){
		printf("%d ",i);
	}
}
