#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int i = 0;
	//contar até 10 com o laço WHILE
	while(i <= 10){
		printf("%d\n",i);
		i+=2;
	}
}
