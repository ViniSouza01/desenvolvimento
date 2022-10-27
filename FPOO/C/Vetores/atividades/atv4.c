// localize um valor informado pelo usuário dentro de um vetor com dimensão 10
#include<stdio.h>
#include<locale.h>
#include<time.h>
int main() {
	setlocale(LC_ALL,"");
	srand(time(NULL));
	int vetor[10], i;
	for(i = 0; i < 10; i++) {
		vetor[i] = rand() % 100;
	}
	for(i = 0; i < 10; i++)
	printf("[%d]: %d\n",i+1, vetor[i]);
	
	int procurar = 0;
	while(procurar < 1 || procurar > 10){
		printf("Digite um valor para ser procurado no vetor:\n");
		scanf("%d",&procurar);
	}
	printf("[%d]: %d", procurar, vetor[procurar - 1]);
	
	procurar = -1;
	while(procurar < 0 || procurar > 99) {
		printf("\nAgora digite o número para ser procurado:\n");
		scanf("%d",&procurar);
	}
	int encontrei = 0;
	for(i = 0; i < 10; i++) {
		if(procurar == vetor[i]){
			procurar = i + 1;
			encontrei = 1;
		}
	}
	if(encontrei != 0) printf("Achei o valor no vetor [%d]",procurar);
	else printf("Não encontrei o valor :(");
}
