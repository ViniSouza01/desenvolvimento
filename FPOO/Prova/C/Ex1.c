#include<stdio.h>
#include<locale.h>
#include<stdlib.h>
int idade(int idade);
int sexo(int sex);
int dias(int dias);
int main(){

	setlocale(LC_ALL,"");
	idade(idade);
	printf("\n\n");
	sexo(sexo);
	printf("\n\n");
	dias(dias);
	
	if(sexo == 1 && dias < 60){
		printf("Você não poderá doar ainda, espere completar 60 dias desde a sua última doação");
		exit(0);
	}else if(sexo == 2 && dias < 90){
		printf("Você não poderá doar ainda, espere completar 90 dias desde a sua última doação");
		exit(0);
	}else{
		printf("Muito bem! Você já pode doar sangue novamente ;)");
		exit(0);
	}
}
int idade(int idade){
	printf("Digite a sua idade abaixo:\n");
	scanf("%d", &idade);
	if(idade <= 15 || idade >= 70){
		printf("\nSegundo o ministério da saúde, a doação de sangue pode ocorrer apenas entre os 16 e 69 anos\nPrograma encerrado.");
		exit(0);
	}else {
		return idade;
	}
}


int sexo(int sexo){
	sexo = 0;
	while(sexo <= 0 || sexo > 2){
	printf("Digite seu sexo equivalente aos números correspondentes:\n[1. Masculino]\n[2. Feminino]:\n");
	scanf("%d", &sexo);
	}
	return sexo;
}


int dias(int dias){
	printf("Digite a quantidade de dias que você realizou a última doação de sangue:\n");
	scanf("%d", &dias);
	return dias;
}
