#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	char string[10];
	printf("Digite um caracter:\n");
	gets(string);  //lê qualquer tipo de caractere
	printf("Você digitou o caracter %s",string); //mostra na tela o caractere que você digitou
	return 0;
}
