#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	float precos[5];
	int i, continuar = 1;
	char mercadorias[5][15];
	while(continuar == 1){
	printf("Digite o nome das mercadorias\n");
	//entrada
		for(i = 0; i < 5; i++){
			scanf("%s",&mercadorias[i]);
		}
		printf("Digite o preço das mercadorias, respectivamente\n");
		for(i = 0; i < 5; i++){
		scanf("%f",&precos[i]);
		}
	//processamento
	
		for(i = 0; i < 5; i++){
			if(precos[i] < 1000) precos[i] = precos[i] + (precos[i] * 0.05);
			else precos[i] = precos[i] + (precos[i] * 0.07);	
		}
	//saída
		for(i = 0; i < 5; i++){
			printf("O preço do produto %s atualmente é %.2f\n",mercadorias[i],precos[i]);
		}
		printf("Deseja continuar?\n[1.Sim]\n[2.Não]\n");
		scanf("%d",&continuar);
	}
	
}
