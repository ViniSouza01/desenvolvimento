/*Desenvolva um programa que calcule desconto de INSS de um funcionário, se o salário for menos ou
igual do que R$1212,00 será de 7,5% se estiver entre R$1212,01 e R$	2427,35 será de 9%, se esiver entre R$2427,36
e 3641,03 o desconto é de 12%, se estiver entre R$3461,04 a R$7087,22 será de 14% e se for maior que 7087,22 
o teto que é o máximo cobrado 14% de7087,22. Mostre o desconto e o valor do salário final*/
#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	float salario, porcento,desconto,final;
//entrada	
	printf("Digite seu salário:\n");
	scanf("%f",&salario);
//processamento
	if(salario <= 1212,00){
		porcento = 7,5 / 100;
		desconto = salario * porcento;
	}else if(salario < 2427,35){
		porcento = (float) 9 / 100;
		desconto = salario * porcento;
	}else if(salario < 3641,03){
		porcento = (float) 12 / 100;
		desconto = salario * porcento;
	}else{
		porcento = (float) 14 / 100;
		desconto = salario * porcento;
	}
	final = salario - desconto;
//saída
	printf("O seu salário corresponde a: %.2f \n",salario);
	printf("O seu desconto será de: %.2f \n",desconto);
	printf("O seu salário final é de: %.2f \n",final);
	}
