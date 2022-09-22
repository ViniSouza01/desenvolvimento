#include<stdio.h>
#include<locale.h>
int main(){
	//informações
	setlocale(LC_ALL,"");
	float hora, numero, salario, total;
	float inss, ir, sindicato;
	printf("Digite o valor que você ganha por hora:\n");
	scanf("%f",&hora);
	printf("Digite quantas horas você trabalha no mês:\n");
	scanf("%f",&numero);
	salario = hora * numero;
	//processamento
	inss = salario * 0.08;
	ir = salario * 0.11;
	sindicato = salario * 0.05;
	total = salario - inss - ir - sindicato;
	
	//saída
	printf("Seu salário bruto é de: %.2f\n",salario);
	printf("O desconto do Imposto de Renda é de: %.2f\n",ir);
	printf("O desconto do INSS é de: %.2f\n",inss);
	printf("O desconto do sindicato é de: %.2f\n",sindicato);
	printf("O seu salário líquido é de: %.2f\n",total);
}
