#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	char string[10];
	printf("Digite um caracter:\n");
	gets(string);  //l� qualquer tipo de caractere
	printf("Voc� digitou o caracter %s",string); //mostra na tela o caractere que voc� digitou
	return 0;
}
