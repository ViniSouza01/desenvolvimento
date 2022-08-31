#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int num,i,i2,resultado1,resultado2;
	int par[10], impar[10], pares = 0, impares = 0;
	//Escaneando os números digitados
	do{
		printf("digite um numero para entrar no vetor:");
		scanf("%d",&num);
	
			if(num % 2 == 0){
				par[pares] = num;
				pares++;
			}else{
				impar[impares] = num;
				impares++;
	}
}while(pares < 10 && impares < 10);
	printf("Números pares:\n");
	for(i = 0; i < 10; i++){
		printf("%d",pares);
	}
	printf("Números ímpares:\n");
	for(i = 0; i < 10; i++){
		printf("%d",impares);

}
}
