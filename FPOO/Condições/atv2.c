/*Desenvolva um programa que leia o sal�rio de um funcion�rio e o n�mero de filhos.
Se o sal�rio for menor que 2000 o funcion�rio receber� um sal�rio fam�lia de 45 reais por filho.
Apresente o sal�rio final*/
#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	char name[20];
	float salario,final;
	int filhos;
	printf("Digite o seu sal�rio:\n");
	scanf("%f",&salario);
	printf("Digite quantos filhos voc� tem:\n");
	scanf("%d",&filhos);
	
	if (salario < 1655){
		final = filhos * 56.47;
	}printf("Seu sal�rio � de:\nR$%.2f", salario);
	printf("Seu sal�rio familia � de:")
}
