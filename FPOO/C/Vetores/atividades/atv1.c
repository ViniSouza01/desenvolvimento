#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int vetor1[5], vetor2[5], i;
	int resultado1,resultado2,resultado3,resultado4,resultado5;
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
	resultado1 = vetor1[0] + vetor2[4];
	resultado2 = vetor1[1] + vetor2[3];
	resultado3 = vetor1[2] + vetor2[2];
	resultado4 = vetor1[3] + vetor2[1];
	resultado5 = vetor1[4] + vetor2[0];

	printf("Resultado 1: %d\n", resultado1);
	printf("Resultado 2: %d\n", resultado2);
	printf("Resultado 3: %d\n", resultado3);
	printf("Resultado 4: %d\n", resultado4);
	printf("Resultado 5: %d\n", resultado5);
}
