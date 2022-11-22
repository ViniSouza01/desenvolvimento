#include<stdio.h>
#include<locale.h>
float percentual(float irrf);
int main() {
char nome[15];
float irrf;
printf("Olá usuário, por favor digite seu nome: ");
scanf("%s", &nome);
irrf = percentual(irrf);
printf("%s, o valor do seu IRRF é de: %.2f\n", nome, irrf);
return 0;
}

float percentual(float irrf) {
    float salario, aliquota, taxa, resultado;
    printf("Agora digite seu salário: ");
    scanf("%f", &salario);
    if (salario <= 1903,98){
        aliquota = 0;
        taxa = 0;
    }
    else if (salario <= 2826,65){
        aliquota = 0.075;
        taxa = 142.80;
    }
    else if (salario <= 3751,05){
        aliquota = 0.15;
        taxa = 354.80;
    }
    else if (salario <= 4664.69){
        aliquota = 0.225;
        taxa = 636.13;
    }
    else{
        aliquota = 0.275;
        taxa = 869.36;
    }

    resultado = salario * aliquota;
    irrf = resultado - taxa;
    return irrf;
}
