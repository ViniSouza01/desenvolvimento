#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int vetor[6],i;
	for(i=0;i<6;i++){
		printf("Digite um número para o vetor %d:\n",i);
		scanf("%d",&vetor[i]);
	}
	int aux;
	aux = vetor[5];
	vetor[0] = aux;
	aux = vetor[4];
	vetor[1] = aux;
	aux = vetor[3];
	vetor[2] = aux;
	
	for(i=0;i<6;i++){
	printf("o resultado do vetor é %d\n",vetor[i]);
}
}
