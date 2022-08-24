#include<stdio.h>
#include<locale.h>
//CONFIGURAÇÕES VARIÁVEIS//
int main (){
	setlocale(LC_ALL,"");
	int cor;
	//ENTRADA//
	printf("Digite a cor do semáforo \n[1.verde   ] \n[2.amarelo ] \n[3.vermelho] \n");
	scanf("%d",&cor);
	
	//PROCESSAMENTO
	switch(cor){
		case 1:
			printf("Você escolheu verde, portanto pode ir\n");
		break;
		case 2:
			printf("Você escolheu amarelo, portando fique atento\n");
			break;
		case 3:
			printf("Você escolheu vermelho, portanto espere");
			break;
		default:
			printf("Cor inválida \n");
	}
	printf("Fim");
	//SAÍDA//
}
