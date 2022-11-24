#include<stdio.h>
#include<locale.h>
int main() {
	char nome[15];
	float irrf, salario;
	printf("Olá usuario, por favor digite seu nome: ");
	scanf("%s", &nome);
	printf("Agora digite seu salario: ");
    scanf("%f", &salario);
    
    if(salario <= 1903.98) {
    	irrf = 0;
	}
    
    else if (salario <= 2826.65){
    	irrf = (salario * 0.075) - 142.80;
    }
    else if (salario <= 3751.05){
    	irrf = (salario * 0.15) - 354.80;
    }
    else if (salario <= 4664.69){
    	irrf = (salario * 0.225) - 636.13;
    }
    else{
    	irrf = (salario * 0.275) - 869.36;
    }
    
	printf("%s, seu valor de IRRF e: %.2f",nome, irrf);		
	return 0;
}
