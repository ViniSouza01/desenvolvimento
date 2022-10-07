#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int a,b,c;
	printf("Digite o comprimento a do triângulo:\n");
	scanf("%d",&a);
	printf("Digite o comprimento b do triângulo:\n");
	scanf("%d",&b);
	printf("Digite o lado c do triângulo:\n");
	scanf("%d",&c);
	
	if (a == b && b == c){
		printf("O triângulo é Equilátero");
	}else if(a != b && b != c && a != c){
		printf("O triângulo é Escaleno");
	}else{
		printf("O triângulo é isóceles");
	}
}
