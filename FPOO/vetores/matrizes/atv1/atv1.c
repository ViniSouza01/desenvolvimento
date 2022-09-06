#include<stdio.h>
#include<locale.h>
int main (){
	setlocale(LC_ALL,"");
	char nome[5][15];
	float salarios[5];
	float percentual;
	int i;
	printf("Digite o nome das 5 pessoas:\n");
	for(i = 1; i <= 5; i++){
		scanf("%s",&nome[i]);
	}
	printf("\n\n");
	//condição
	printf("Digite os salários das 5 pessoas, respectivamente: ",i);
	for(i = 1; i <= 5; i++){
		do{
		scanf("%f",&salarios[i]);
		}while(salarios[i] < 0 || salarios[i] > 1000000);
	}
		printf("Digite o percentual (%%) de reajuste: ");
	do{
		scanf("%f",&percentual);
	}while(percentual < 0 || percentual > 1000);
	//processamento e saída
	for(i = 1; i <= 5; i++){
		salarios[i] = salarios[i] * percentual / 100 + salarios[i];
		printf("O novo salário de %s é de: R$%.2f\n",nome[i],salarios[i]);
}
}

