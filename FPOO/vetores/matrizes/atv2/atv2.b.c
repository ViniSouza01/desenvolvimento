#include<stdio.h>
#include<locale.h>
int main (){
	setlocale(LC_ALL,"");
	char times[5][20];
	int i,vitorias[5], empates[5],pont[5];
	printf("Digite os nomes dos times:\n");
	for(i = 0; i <= 5; i++){
		scanf("%s",&times);
	}
	printf("\n\n");
	printf("Digite a quantidade de vitórias, respectivamente dos times:\n");
	for(i = 0; i < 5; i++){
		do{
			scanf("%d",&vitorias[i]);
		}while(vitorias[i] < 0 || vitorias[i] > 35);
}
		printf("Digite a quantidade de empates, respectivamente dos times:\n");
	for(i = 0; i < 5; i++){
		do{
			scanf("%d",&empates[i]);
		}while(empates[i] < 0 || empates[i] > 20);
}
	for(i = 0; i < 5; i++){
		vitorias[i] = vitorias[i] * 3;
}
	for(i = 0; i < 5; i++){
	pont[i] = vitorias[i] + empates[i];
	}
	int aux,j;
	for (i=0;i<5;i++){
		for(j = i + 1;j < 5; j++){
			if(pont[i] < pont[j]){
				aux = pont[i];
				pont[i] = pont[j];
				pont[j] = aux;
			}

}
}
	for(i = 0;i<5;i++)
	printf("[%d]:%d\n", i+1, pont[i]);
}
