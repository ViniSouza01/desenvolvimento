// gere 100 valores inteiros aleatorios e os classifique de ordem crescente
#include<stdio.h>
#include<locale.h>
#include<time.h>
int main(){
	setlocale(LC_ALL,"");
	srand(time(NULL));
	int v[100];//vetores a ser classificados
	int i,j; //contadores
	int aux; //auxiliar para fazer trocas
	
	for(i = 0; i < 100; i++){
		v[i] = rand()%1000;
	}
	for(i = 0; i < 100; i++){
		for(j = i+1; j < 100; j++){
			if(v[i] > v[j]){
				aux = v[i];
				v[i] = v[j];
				v[j] = aux;
			}
		}
	}
	//saída com o vetor ordenado
	for(i=0;i<100;i++){
		printf("[%d]: %d\n",i+1,v[i]);
	}

}
