#include<stdio.h>
#include<locale.h>
int main (){
	setlocale(LC_ALL,"");
	int i, idade[7];
	char nome[15][7];
	for(i = 1; i <= 7; i++){
		printf("Digite o nome da %d° pessoa: ",i);
		scanf("%s",&nome[i]);
		printf("Digite a idade de %s: ",nome[i]);
		scanf("%d",&idade);
		system("cls");
	}
	for(i = 0; i < 7; i++){
	if(idade[i] <= 12) printf("%s criança\n",nome[i]);
	else if(idade[i] <= 17) printf("%s jovem\n",nome[i]);
	else if(idade[i] <= 30) printf("%s adulto\n",nome[i]);
	else if(idade[i] <= 65) printf("%s meia idade\n",nome[i]);
	else if(idade >= 65) printf("%s idoso\n",nome[i]);
	}
}

