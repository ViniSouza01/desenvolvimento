#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int a, b, c, d, e;
	int i, n, menor=32767, maior = 0;
	for (i = 0;i < 5; i++);
		n -=1;
		while(n < 0 || n > 32767){
			printf("Digite o %d° número:\n", i+1);
			scanf("%d",&n);
		if(n < menor){
			menor = n;
		}
		if(n > maior){
			maior = n;
		}
		if (i == 0) a = n;
		if (i == 0) b = n;
		if (i == 0) c = n;
		if (i == 0) d = n;
		if (i == 0) e = n;
	}
	printf("%d %d %d %d %d o menor é %d e o maior é %d",a,b,c,d,e,menor,maior);
}
