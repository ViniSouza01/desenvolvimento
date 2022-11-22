#include<stdio.h>
#include<locale.h>
float percentual(float percentual);
int main() {
setlocale(LC_ALL,"");
char nome[15];
float salario;

printf("Olá usuário, por favor, digite seu nome: ");
scanf("%s", &nome);

printf("Agora digite seu salário: ");
salario = percentual(salario);

printf("%s, seu saldo de FGTS é de: %.2f\n",nome, salario);
return 0;
}


float percentual(float salario) {
scanf("%f", &salario);
return salario * 0.08;
}
