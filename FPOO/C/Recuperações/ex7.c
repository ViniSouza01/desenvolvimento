#include<stdio.h>
int main() {
	char nome[5] [15];
	float salario[5], soma, media;
	int i;
	
	printf("Ola usuario, digite o nome e o salario de 5 pessoas:\n");
	for(i = 0; i < 5; i++){
		scanf("%s%f", &nome[i], &salario[i]);
		soma += salario[i];
		media = soma / 5;
	}
	
	printf("A media de salarios e: %.2f", media);
	return 0;
}
