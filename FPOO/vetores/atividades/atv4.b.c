#include<stdio.h>
#include<time.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	srand(time(NULL));
	int v[50];
	int onde = -1,i, num;
	//gerar os n�meros aleat�riamente para o vetor
	for(i = 0; i < 50; i++){
		v[i] = rand() % 100;
		printf("[%d]%d\n",i,v[i]);
	}
	//entrada
	printf("Digite um n�mero inteiro:\n");
	scanf("%d",&num);
	//processamento
	for(i = 0; i < 50; i++){
		if(v[i] == num){
		onde = i;
	}
	}
	//sa�da
	if(onde != -1) printf("\nEncontrei na posi��o %d :)",onde);
	else printf("\nN�o encontrei:(");
	}
