#include<stdio.h>
float media(float media);
int main() {
	float numeros[3], soma = 0, media;
	int i;
	printf("Digite 3 numeros inteiros:\n");
	for(i = 0; i < 3; i++) {
		scanf("%f", &numeros[i]);
		soma = soma + numeros [i];
	}
	media = soma / 3;
	printf("A media dos tres numeros e: %.1f", media);
}
