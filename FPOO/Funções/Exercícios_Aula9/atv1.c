#include<stdio.h>
#include<locale.h>
#include<time.h>
int main(){
	setlocale(LC_ALL,"");
	srand(time(NULL));
	char nomes [15][10];
	int i,aux;
	for(i = 0; i < 10; i++){
		printf("[%d]: ",i);
		scanf("%s",&nomes[i]);
	}
	printf("\n\n");
	aux = rand() % 10;
	printf("O nome sorteado é: %s",nomes[aux]);
}
