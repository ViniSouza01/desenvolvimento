/*Desenvolva um programa que leia o preço de um produto e se o preço for maior que R$1000, aplique um desconto de 8%.*/
#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	float preco;
	//entrada//
	printf("Digite o preço do produto:\n");
	scanf("%f",&preco);
	if(preco > 1000){
		preco = preco - (preco * 0.08);	
	}
	printf("O preço final do produto é de:\nR$%.2f",preco);
}
