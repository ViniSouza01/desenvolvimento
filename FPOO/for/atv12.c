#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int n,i, maior = 0;
	for(i = 0; i < 10; i++){
		n = -1;
		while (n < 0 || n > 32767){
			printf("Digite o %d° número:\n",i+1);
			scanf("%d",&n);
		}
		if (n > maior) maior = n;
	}
	//saída
	printf("O maior número digitado foi %d", maior);
}
