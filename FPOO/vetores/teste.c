#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int vetor[5];
	int i = 0;
	
	while(i <= 4){
	printf("digite n�meros para adicion-alos ao vetor:\n");
	scanf("%d",&vetor[i]);
	i++;
}
	scanf("Os valores que voc� digitou foram: %d",vetor[i]);
}
