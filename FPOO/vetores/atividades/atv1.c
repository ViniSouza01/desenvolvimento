#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int vetor1[5], vetor2[5], i;
	//vetor 1
	printf("Vetor N° 1:\n");
	for(i = 0; i < 5; i++){
		printf("Digite um valor para o índice %d: ",i);
		scanf("%d",&vetor1[i]);
	}
	//vetor 2
	printf("Vetor N° 2:\n");
	for(i = 0; i < 5; i++){
		printf("Digite um valor para o índice %d: ",i);
		scanf("%d",&vetor2[i]);
	}	printf("\n\n");
	//saída
	for(i = 0; i < 5; i++){
	vetor1[i] += vetor2 -i;
}
	printf("Resultado 1: %d\n", vetor1[0]);
	printf("Resultado 2: %d\n", vetor1[1]);
	printf("Resultado 3: %d\n", vetor1[2]);
	printf("Resultado 4: %d\n", vetor1[3]);
	printf("Resultado 5: %d\n", vetor1[4]);	
}
