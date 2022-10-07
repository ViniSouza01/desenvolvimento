#include<stdio.h>
#include<locale.h>
float parafahrenheit(float celsius);
int main (int aegc, char *argv[]){
	setlocale(LC_ALL,"");
	float c, f;
	printf("Digite a temperatura em graus Celsius:\n");
	scanf("%f",&c);
	f = parafahrenheit(c);
	printf("A temperatura em C°%.1f em F°%.1f",c,f);	
}
float parafahrenheit(float celsius){
	return celsius * 9 / 5 + 32;
}
