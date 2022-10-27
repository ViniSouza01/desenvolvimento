// criar um vetor para o usuário preencher com 10 valores e apresentar:
// a soma e média dos pares
// a soma e média dos ímpares
// o total de números pares
// o total de números ímpares
#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	float i,media1,media2,i2;
	int num,resultado1,resultado2;
	int par[10], impar[10], pares = 0, impares = 0;
	
	//Escaneando os números digitados
	do{
		printf("digite um numero para entrar no vetor: ");
		scanf("%d",&num);
			if(num % 2 == 0){
				par[pares] = num;
				pares++;
				i = i + num;
			}else{
				impar[impares] = num;
				impares++;
				i2 = i2 + num;
	}
}while(pares < 10 && impares < 10);
	//
	media1 = i / pares;
	media2 = i2 / impares;
	
	//soma
	printf("\nSoma de todos os números pares: %.0f\n",i);
	printf("Soma de todos os números impares: %.0f\n",i2);
	printf("\n\n");
	
	//média
	printf("Média dos números pares: %.2f\n",media1);
	printf("Média dos números ímpares: %.2f\n",media2);
	printf("\n\n");
	
	//quantidade
	printf("Quantidade de números pares: %d\n",pares);
	printf("Quantidade de números impares: %d",impares);
}
