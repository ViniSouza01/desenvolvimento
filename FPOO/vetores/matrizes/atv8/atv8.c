#include<stdio.h>
#include<locale.h>
#include<time.h>
int main(){
	srand(time(NULL));
	setlocale(LC_ALL,"");
	int i,num[25],maior = 0,menor = 25,maior2 = 0,menor2 = 25;
	for(i = 1; i <= 25; i++) num[i] = rand() % 26;
	for(i = 1; i <= 25; i++){
		printf("[%d]:%d\t\t",i,num[i]);
		if(i % 5 == 0) printf("\n\n");
	}
	printf("\n\n");
	int posicao1,posicao2;
	for(i = 21; i <= 25; i++){
		if(num[i] < menor){
			menor = num[i];
			posicao1 = i;
		}
		if(num[i] > maior){
		maior = num[i];
		posicao2 = i;
	}
	}
	int posicao3,posicao4;
	for(i = 3; i <= 25; i+=5){
		if(num[i] < menor2) {
		menor2 = num[i];
		posicao3 = i;
		}
		if(num[i] > maior2){
		maior2 = num[i];
		posicao4 = i;
		}
	}
	printf("Fileira 4:\nmaior número [%d]:%d\nmenor número[%d]:%d\n\n",posicao2,maior,posicao1,menor);
	printf("Coluna 3:\nmaior número [%d]:%d\nmenor número [%d]:%d",posicao4,maior2,posicao3,menor2);
}
