#include<stdio.h>
#include<locale.h>
int retangulo();
int main(){
	setlocale(LC_ALL,"");
	int altura, largura, ret;
	char string[5];
	printf("Digite uma largura para o retangulo:\n");
	scanf("%d",&largura);
	printf("DIgite uma altura para o retangulo:\n");
	scanf("%d",&altura);
	printf("Digite o caracter que você deseja fazer o retângulo:\n");
	scanf("%s",&string);
	ret = retangulo(altura, largura, string); //mostra o desenho do retângulo
}

// Desenho do retângulo com repetidores
int retangulo(altura, largura, string){
	int i = 0,j = 0;
	while(i < altura){
		for(j = 0; j < largura; j++){
			printf("%s",string);
		}
		printf("\n");
		i++;
	}
	return retangulo;
}
