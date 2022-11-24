#include<stdio.h>
int main() {
	float distancia, horas, velocidade;
	int i;
	
	//input
	printf("Ola, digite a distancia entre as duas cidades:\n");
	scanf("%f", &distancia);
	printf("Agora digite quanto tempo em horas o veiculo demorou para percorrer:\n");
	scanf("%f", &horas);
	
	// processing
	velocidade = distancia / horas;
	printf("A velocidade media do veiculo foi de %.1f km/h", velocidade);
	return 0;
}
