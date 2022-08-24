#include<stdio.h>
#include<locale.h>
int main (){
	setlocale(LC_ALL,"");
	float peso = -1;
	float excesso, multa;
	while (peso < 0 ||peso > 10000){
		printf("João, digite quantos quilos de peixe você pescou hoje:\n");
		scanf("%f",&peso);
	}
	//processamento
	if (peso > 50){
		excesso = peso - 50;
		multa = excesso * 4;
		printf("João, você pescou %.1f kg em excesso deve pagar uma multa de %.2f",excesso,multa);
	}else{
		printf("Hoje sua pesca está dentro do regulamento, menos de 50 kg.");
	}
	
	//saída
	
	
}
