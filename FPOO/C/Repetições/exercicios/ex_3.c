#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int continuar = 1;
	float media;
	//Programa que leia 2 números e encontre a média
	//O programa deve perguntar ao usuário se deseja continuar
	while(continuar == 1){
		int nota1 = -1,nota2 = -1;
	while(nota1 < 0 || nota1 > 100){
		printf("Digite a primeira nota entre 0 a 100:\n");
		scanf("%d",&nota1);
	}
	while(nota2 < 0 || nota2 > 100){
		printf("Digite a segunda nota entre 0 a 100:\n");
		scanf("%d",&nota2);
	}
	media = (float) (nota1 + nota2) / 2;
	printf("A média é %.1f\n",media);
	
	printf("Deseja continuar?\n[1. sim]\n[2. não]\n");
	scanf("%d",&continuar);
	
	if(continuar == 2){
		printf("Você escolheu sair, programa encerrado.");
	}
}
}
