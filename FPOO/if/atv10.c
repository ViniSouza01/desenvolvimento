#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int a,b,c;
	float media;
	//entrada
	printf("Digite as 3 médias do aluno:\n");
	scanf("%d",&a);
	scanf("%d",&b);
	scanf("%d",&c);
	media = (a + b + c ) / 3;
	printf("Sua média resultou em: %.1f \n",media);
	//processamento e saída
	if(media >= 6){ 
		printf("Aluno aprovado");
	}else if(media >= 4){
		printf("Aluno de recuperação");
	}else if(media < 4){
		printf("Aluno reprovado");
	}
}
