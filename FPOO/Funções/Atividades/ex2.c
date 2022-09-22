#include<stdio.h>
#include<stdbool.h>
#include<locale.h>
bool maior(int valor1, int valor2);	
int main (int aegc, char *argv[]){
	setlocale(LC_ALL,"");
	printf("%d",maior("%d","%d"));
	return 0;
}
bool maior(int valor1, int valor2){
	scanf("%d",&valor1);
	scanf("%d",&valor2);
	if(valor1 > valor2) printf("O número %d é maior",valor1);
	else printf("O número %d é maior",valor2);
	return printf("\n\n");
}
