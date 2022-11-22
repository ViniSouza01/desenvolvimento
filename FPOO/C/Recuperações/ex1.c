#include<stdio.h>
#include<locale.h>
int main() {
	setlocale(LC_ALL,"");
	int idade[5];
	char nome[5][15];
	int i;
	printf("Digite o nome e idade de 5 pessoas\n");
	for(i = 0; i < 5; i++) {
		scanf("%s %d", &nome[i], &idade[i]);
	}
	printf("\n");
	for(i = 0; i < 5; i++) {
		if(idade[i] < 10)
			printf("%s\t%d\tcrianca\n", nome[i], idade[i]);
		else if(idade[i] < 20)
			printf("%s\t%d\tjovem\n",nome[i], idade[i]);
		else if(idade[i] < 60)
			printf("%s\t%d\tadulto\n", nome[i], idade[i]);
		else printf("%s\t%d\tidoso\n", nome[i], idade[i]);
	}
	return 0;
}
