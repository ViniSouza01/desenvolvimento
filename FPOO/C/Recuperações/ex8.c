// pegue o nome e o salario de 5 pessoas e 
// mostre o mais bem pago e o menos bem pago

#include<stdio.h>
int main() {
	char nome[5][15];
	float salario[5], maior = 0, menor = 9999999;
	int i, salarioMaior = 0, salarioMenor = 0;
	// input
	printf("Ola usuario, digite o nome e o salario de 5 pessoas:\n");
	for(i = 0; i < 5; i++) {
	scanf("%s%f", &nome[i], &salario[i]);
	}
	
	// look for the max and min wage
	for(i = 0; i < 5; i++) {
		if(salario[i] < menor){
			menor = salario[i];
			salarioMenor = i;
		}
		else if(salario[i] > maior){
			maior = salario[i];
			salarioMaior = i;
		}
	}
	
	// output
	printf("A pessoa com maior salario e: %s - %.2f\n", nome[salarioMaior], salario[salarioMaior]);
	printf("A pessoa com menor salario e: %s - %.2f\n", nome[salarioMenor], salario[salarioMenor]);
}
