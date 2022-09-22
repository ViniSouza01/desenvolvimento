#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	float salarioInicial,salarioFinal,reajuste;
	
	printf("Digite o salario do colaborador:\n");
	scanf("%f",&salarioInicial);
	float percentual;
	if(salarioInicial <= 280){
		percentual = 0.20;
		reajuste = salarioInicial * percentual;
	}else if(salarioInicial <= 700){
		percentual = 0.15;
		reajuste = salarioInicial * percentual;
	}else if(salarioInicial <= 1500){
		percentual = 0.10;
		reajuste = salarioInicial * percentual;
	}else if(salarioInicial > 1500){
		percentual = 0.05;
		reajuste = salarioInicial * percentual;
	}
	salarioFinal = salarioInicial + reajuste;
	//saída
	printf("Seu salário antes do reajuste é de: %.2f\n",salarioInicial);
	printf("O percentual de aumento de acordo com seu salário é de: %.2f\n",percentual);
	printf("O valor do aumento é de: %.2f\n",reajuste);
	printf("Seu salário após o aumento é de: %.2f",salarioFinal);
}
