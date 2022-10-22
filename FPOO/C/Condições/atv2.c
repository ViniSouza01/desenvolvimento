/*Desenvolva um programa que leia o salário de um funcionário e o número de filhos.
Se o salário for menor que 2000 o funcionário receberá um salário família de 45 reais por filho.
Apresente o salário final*/
#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	char name[20];
	float salario, final;
	int filhos;
	printf("Digite o seu salário:\n");
	scanf("%f",&salario);
	printf("Digite quantos filhos você tem:\n");
	scanf("%d",&filhos);
	
	// calculate the wage
	if(salario < 2000) {
		final = filhos * 45;
		printf("Seu salário família é de: %.2f",final);
	} else printf("Você não tem direito ao salário família");
}
