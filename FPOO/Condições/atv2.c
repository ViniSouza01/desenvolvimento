/*Desenvolva um programa que leia o salário de um funcionário e o número de filhos.
Se o salário for menor que 2000 o funcionário receberá um salário família de 45 reais por filho.
Apresente o salário final*/
#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	char name[20];
	float salario,final;
	int filhos;
	printf("Digite o seu salário:\n");
	scanf("%f",&salario);
	printf("Digite quantos filhos você tem:\n");
	scanf("%d",&filhos);
	
	if (salario < 1655){
		final = filhos * 56.47;
	}printf("Seu salário é de:\nR$%.2f", salario);
	printf("Seu salário familia é de:")
}
