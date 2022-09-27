#include<stdio.h>
#include<locale.h>
#include<time.h>
int main(){
	setlocale(LC_ALL,"");
	srand(time(NULL));
	char nomes [15][10];
	int i,aux;
	for(i = 0; i < 10; i++){
		printf("Nome [%d]: ",i);
		scanf("%s",&nomes[i]);
	}
	printf("\n\n");
	printf("O nome sorteado é: %s",nomes[aux]);
}
