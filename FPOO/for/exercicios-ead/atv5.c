#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int i,a,b,c,x,d;
	
	printf("Digite um n�mero para a letra 'a': ");
	scanf("%d",&a);
	if(a <= 0){
	printf("A letra a foi declarada como n�mero zero.\nPrograma encerrado.");
	exit(0);
	}
	printf("Digite um n�mero para a letra 'b': ");
	scanf("%d",&b);
	printf("Digite um n�mero para a letra 'c': ");
	scanf("%d",&c);
	
	//equa��o 2� grau
	d=(b*b)-4*a*c;
	if(d < 0){
		printf("O valor de delta foi de %d, portanto, ele n�o possui ra�zes reais.\nPrograma encerrado",d);
		exit(0);
	}
	printf("O delta resultou em %d\n",d);
	int contaraiz,x1,x2;
	float raiz;
	//equa��o 2� grau parte II
	contaraiz=(b*b)-4*a*c;
	raiz = (float)sqrt(d);
	printf("%.2f",raiz);
}
