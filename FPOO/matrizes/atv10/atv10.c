#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	char alunos [5][10];
	int i,notas1[5], notas2[5];
	float medias[5];
	//entradas
	printf("Digite os nomes e notas dos 5 alunos:\n");
	printf("Nome\tNota 1\tNota2\t\n");
	for(i = 0; i < 5; i++){
		scanf("%s", &alunos[i]);
		scanf("%d", &notas1[i]);
		scanf("%d", &notas2[i]);
	}
	//Processamento e saída
	printf("[Aluno] [Nota 1] [Nota 2] [Média]\n");
	for(i = 0; i < 5; i++){
		medias[i] = (float)(notas1[i] + notas2[i] / 2);
		printf("[%s]\t [%d]\t [%d]\t [%d]\n",alunos[i],notas1[i],notas2[i],medias[i]);
	}
}
