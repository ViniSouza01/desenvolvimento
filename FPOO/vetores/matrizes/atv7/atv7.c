#include<stdio.h>
#include<locale.h>
#include<time.h>
int main(){
	setlocale(LC_ALL,"");
	srand(time(NULL));
	int v[9],pares[9],impares[9];
	int i,par,impar,num[9];
	int maior = 0;
	for(i = 0; i < 9; i++){
	num[i] = rand() % 10;
	}
	for(i = 0; i < 9; i++) printf("[%d]:%d\n",i,num[i]);
	printf("\n\n");
	int posicao;
	for(i = 0; i < 9; i++){
		if(num[i] > maior){
			maior = num[i];
			posicao = i;
		}
	}
	printf("O maior número é %d na posição [%d]",maior,posicao);
}
