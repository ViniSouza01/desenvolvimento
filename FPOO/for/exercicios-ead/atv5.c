#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int i,a,b,c,x,d,dzero;
	printf("Digite um número para a letra 'a': ");
	scanf("%d",&a);
	if(a <= 0){
	printf("\nA letra 'a' foi declarada como número zero.\nPrograma encerrado.");
	exit(0);
	}
	printf("\nDigite um número para a letra 'b': ");
	scanf("%d",&b);
	printf("\nDigite um número para a letra 'c': ");
	scanf("%d",&c);
	//equação 2° grau
	d=(b*b)-4*a*c;
	if(d < 0){
		printf("O valor de delta foi de %d, portanto, ele não possui raízes reais.\nPrograma encerrado",d);
		exit(0);
	}
	printf("O delta resultou em %d\n",d);
	float raiz,x1,x2;
	//equação 2° grau parte II
	raiz = (float)sqrt(d);
	if(d <= 0){
		dzero = -b/(2*a);
		printf("O delta se resultou em 0, então ele possui apenas uma raíz real, que é: %d",dzero);
		exit(0);
	}
	x1 = (-b+raiz)/(2*a);
	x2 = (-b-raiz)/(2*a);
	printf("X1 = %.2f\nX2 = %.2f",x1,x2);
}
