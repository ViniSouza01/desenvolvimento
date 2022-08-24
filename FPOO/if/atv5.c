#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	char name[20];
	float preco;
	
	printf("Digite o nome da mercadoria (máx 20 caracteres sem espaços)\n");
	scanf("%s",&name);
	printf("Digite o preço da mercadoria:\n");
	scanf("%f",&preco);
	
	if (preco < 1000){
		preco = preco + preco * 0.05;
	}else{
		preco = preco + preco * 0.07;
	}
	printf("O preço do seu (sua) %s é de: %.2f",name,preco);
}
