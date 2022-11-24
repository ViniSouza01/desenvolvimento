#include<stdio.h>
#include<locale.h>
int main() {
	char nome[5][15];
	float salario[5];
	int i = 0;
	
	//input
	printf("Ola usuario, digite o nome e o salario de 5 pessoas:\n");
	for(i = 0; i < 5; i++) {
		scanf("%s%f", &nome[i], &salario[i]);
	}
	
	//FGTS
	float fgts[5];
	for(i = 0; i < 5; i++) {
		fgts[i] = salario[i] * 0.08;
	}
	
	// output
	for(i = 0; i < 5; i++) {
		printf("O saldo de FGTS de cada pessoa e: %.2f\n", fgts[i]);
	}
}
