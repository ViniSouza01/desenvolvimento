/*Desafio 2- criar um programa em que n�o crie n�meros repetidos*/
#include<stdio.h>
#include<time.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	srand(time(NULL));
	int v[10];
	int onde = -1,i,i2,num;
	//gerar os n�meros aleat�riamente para o vetor
	for(i = 0; i < 10; i++){
		v[i] = rand() % 10;
		printf("[%d]%d\n",i,v[i]);
	}
	printf("Segunda parte");
	for(i2 = 0; i < 10; i++){
		if(i2 == i) printf("%d", rand() % 10);
		
	}
}
