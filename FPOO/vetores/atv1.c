#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int vet1 [5];
	int vet2 [5];
	int i = 0;
	int j = 4;
	int total;
	int cont;
	//Repeti��o do primeiro vetor
	while(i <= 4){
	printf("Digite um n�mero para adicion�-lo ao primeiro vetor:\n");
	scanf("%d",&vet1[i]);
	cont = cont + i;
	i++;
	}
	total = total + cont;
	printf("Total da soma setor 1 �: %d",total);
/*	//Repeti��o do segundo vetor
	while(j >= 0){
		printf("Digite outros n�meros para adicion�-los ao segundo vetor:\n");
		scanf("%d",&vet2[j]);
		j--;
	}*/
}
