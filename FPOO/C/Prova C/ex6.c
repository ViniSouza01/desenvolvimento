#include<stdio.h>
#include<locale.h>
int main() {
	setlocale(LC_ALL,"");
	char nome[5][15];
	int idade[5], i = 0, velho = 0, maisVelho = 0;
	printf("Ola usuario, por favor, digite o nome de 5 pessoas e suas idades respectivamente:\n");
	for(i = 0; i < 5; i++) {
		scanf("%s%d", &nome[i], &idade[i]);
	}
	
	// look for the older person
	for(i = 0; i < 5; i++){
		if(idade[i] > velho) {
			velho = idade[i];
			maisVelho = i;
		}
	}
	printf("A pessoa mais velha é %s com %d anos de idade", nome[maisVelho], idade[maisVelho]);
}
