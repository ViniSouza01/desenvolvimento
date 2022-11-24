#include<stdio.h>
int main() {
	char alunos[5][15], resultado[5][15];
	float notasA[5], notasB[5];
	float media[5];
	int i;
	
	printf("Ola usuario, digite o nome e as duas notas dos 5 alunos:\n");
	printf("Exemplo: Carlinhos 7.0 5.0;\n");
	
	for(i = 0; i < 5; i++) {
		scanf("%s%f%f", &alunos[i], &notasA[i], &notasB[i]);
	}
	printf("\n");
	
	//media
	for(i = 0; i < 5; i++) {
		media[i] = (notasA[i] + notasB[i]) / 2;
	}
	
	//aprovado ou reprovado
	for(i = 0; i < 5; i++) {
		if(media[i] < 5)
			printf("%s: media: %.1f, esta REPPROVADO\n",alunos[i], media[i]);
		else printf("%s: media: %.1f, esta APROVADO\n",alunos[i], media[i]);
	}
	return 0;
}
