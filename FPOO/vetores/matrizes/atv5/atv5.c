#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	float precos[10];
	int i, porcento,precofinal[10],continuar = 1;
	char mercadorias[10][20];
	printf("Digite o nome das mercadorias\n");
	for(i = 0; i < 10; i++){
		scanf("%s",&mercadorias[i]);
	}
	printf("Digite o pre�o das mercadorias\n");
	for(i = 0; i < 10; i++){
		scanf("%f",&precos[i]);
	}
	printf("Digite o �ndice percentual (%%) para a mercadoria\n");
	scanf("%d",&porcento);
	for(i = 0; i < 10; i++){
		precofinal[i] = precos[i] - (porcento / 100);
	//sa�da
	for(i = 0; i < 10; i++){
		printf("O pre�o do produto %s ");

}
}
}
