#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int vetor[10],n,i;
	
	for(i=1;i<11;i++){
		printf("Digite um número para colocar no índice %d:\n",i);
		scanf("%d",&vetor[i]);
	}
	printf("Digite o número do índice que você deseja ver o número:\n");
	scanf("%d",&n);
	printf("o número do índice %d é: %d",n,vetor[n]);
}
