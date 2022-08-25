#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int i,vetor[10];
	
	for(i = 0; i < 10; i++){
		printf("Digite um valor para o índice %d",i);
		scanf("%d",&vetor[i]);
	}
	if(vetor[1] % 2 == 0){
		for(i = 0; i < 10; i += 2);
		printf("%d",vetor[i]);
	}
}
