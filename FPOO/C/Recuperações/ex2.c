#include<stdio.h>
#include<locale.h>
int main() {
	setlocale(LC_ALL,"");
	char nome[5][15];
	int idade[5], i;
	float peso[5];
	printf("Digite o nome, a idade e o peso de 5 pessoas\n");
	
	for(i = 0; i < 5; i++) {
		scanf("%s%d%f", &nome[i], &idade[i], &peso[i]);
	}
	printf("\n");
	
	for(i = 0; i < 5; i++) {
	if(idade[i] >= 18 && idade[i] <= 69 && peso[i] > 50)
		printf("%s pode doar sangue\n", nome[i]);
	else printf("%s não pode doar sangue\n", nome[i]);
	}
	return 0;
}
