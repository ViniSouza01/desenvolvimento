#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	char pessoas[7][15];
	int i, idade[7];
	for(i = 1; i <= 7; i++){
		printf("Digite o nome da %d°pessoa:\n",i);
		scanf("%s",&pessoas[i]);
		printf("Agora digite a idade de %s:\n",pessoas[i]);
		scanf("%d",&idade[7]);
		system("cls");
	}
	for(i = 1; i <= 7; i++){
		if(idade[i] <= 12)
			printf("%s é criança.\n",pessoas[i]);
		else if(idade[i] <= 17)
			printf("%s é jovem.\n",pessoas[i]);
		else if(idade[i] <= 30)
			printf("%s é adulto.\n",pessoas[i]);
		else if(idade[i] <= 65)
			printf("%s é de meia idade.\n",pessoas[i]);
		else if(idade[i] > 65)
			printf("%s é idoso.",pessoas[i]);
	}
}
