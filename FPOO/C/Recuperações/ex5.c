#include<stdio.h>
#include<locale.h>
float percentual(float salario);
int main() {
char nome[15];
float salario;

printf("Olá usuário, por favor, digite seu nome: ");
scanf("%s", &nome);

printf("%s, seu saldo de INSS é de: R$%.2f\n", nome, percentual(salario));

return 0;
}

float percentual(float salario) {
    printf("Agora digite seu salário: ");
    scanf("%f", &salario);
    if(salario <= 1212)
        return salario * 0.075;
    else if(salario <= 2427.35)
        return salario * 0.09;
    else if(salario <= 3641.03)
        return salario * 0.12;
    else return salario * 0.14;
}
