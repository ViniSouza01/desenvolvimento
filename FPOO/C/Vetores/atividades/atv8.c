// ler 5 números inteiros aleatórios e classificar em ordem crescente
#include<stdio.h>
#include<locale.h>
int main() {
	setlocale(LC_ALL,"");
	int numeros[5];
	printf("Digite 5 números para entrar no vetor:\n");
	int i;
	for(i = 0; i < 5; i++) {
		printf("[%d]: ",i+1);
		scanf("%d",&numeros[i]);
	}
	int aux, j;
	for(i = 0; i < 5; i++)
		for(j = i + 1; j < 5; j++){
		if(numeros[i] > numeros[j]) {
			aux = numeros[i];
			numeros[i] = numeros[j];
			numeros[j] = aux;
		}
	}
	for(i = 0; i < 5; i++)
	printf("%d ",numeros[i]);
}
