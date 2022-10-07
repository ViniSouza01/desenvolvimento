#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int quantia;
	printf("Digite a quantidade de valor que você deseja sacar em R$:\n");
	printf("R$");
	scanf("%d",&quantia);
	int i = 1;
	int nota2,nota5;
	while(i < quantia){
		if(i%2==0) nota2++;
		if(i%5 !=0) nota5++;
		i++;
	}
	printf("A máquina irá fornecer %d notas de 2 reais",nota2);
	printf("\nA máquina irá fornecer %d notas de 5 reais",nota5);
}
