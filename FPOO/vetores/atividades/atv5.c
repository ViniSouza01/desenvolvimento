#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int v[10]; //vetores a ser classificados
	int i,j; //contadores
	int aux; //auxiliar para fazer trocas
	
	for(i = 0; i < 10; i++){
		printf("Digite o %d° valor inteiro: ",i);
		scanf("%d",&v[i]);
	}
	//processamento - algoritmo de classificação e troca
	for(i = 0; i < 10; i++){
		for(j = i+1; j < 10; j++){
			if(v[i] < v[j]){
				aux = v[i];
				v[i] = v[j];
				v[j] = aux;
			}
		}
	}
	//saída com vetor ordenado
	for(i = 0; i < 10; i++){
		printf("[%d]:%d\n",i+1,v[i]);
	}
}
