#include<stdio.h>
#include<locale.h>
int main()
{
	setlocale(LC_ALL,"");
	int p1=-1,p2=-1,p3=-1,p4=-1,p5=-1;
	
	//perguntas
	while(p1<0||p1>1){
		printf("Você telefonou para a vítima?\n[0.Não]\n[1.Sim]\n");
		scanf("%d",&p1);
	}
	while(p2<0||p2>1){
		printf("Você esteve no local do crime?\n[0.Não]\n[1.Sim]\n");
		scanf("%d",&p2);
	}
	while(p3<0||p3>1){
		printf("Você mora perto da vítima?\n[0.Não]\n[1.Sim]\n");
		scanf("%d",&p3);
	}
	while(p4<0||p4>1){
		printf("Você devia para a vítima?\n[0.Não]\n[1.Sim]\n");
		scanf("%d",&p4);
	}
	while(p5<0||p5>1){
		printf("Já trabalhou a vítima?\n[0.Não]\n[1.Sim]\n");
		scanf("%d",&p5);
	}
	int res= p1 + p2 + p3 + p4 + p5;
	//condição
	if(res < 2){
		printf("Está liberado");
	}else if(res < 3){
		printf("Suspeito");
	}else if(res < 5){
		printf("Cúmplice");
	}else if(res = 5){
	printf("Assassino");
	}
}
