#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int vetor[10],n,i;
	
	for(i=1;i<11;i++){
		printf("Digite um n�mero para colocar no �ndice %d:\n",i);
		scanf("%d",&vetor[i]);
	}
	printf("Digite o n�mero do �ndice que voc� deseja ver o n�mero:\n");
	scanf("%d",&n);
	printf("o n�mero do �ndice %d �: %d",n,vetor[n]);
}
