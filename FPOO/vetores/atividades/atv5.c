/*Para colocar nomes
strcpy(nomes[0];"ana");
strcpy(nomes[1];"maria");
strcpy(nomes[2];"elaine");*/

#include <stdio.h>
#include <string.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"");
    char nomes[5] [20];
    strcpy(nomes[0],"Joaquim");
    strcpy(nomes[1],"Ana");
    strcpy(nomes[2],"Maria");
    strcpy(nomes[3],"Paulo");
    strcpy(nomes[4],"Fernando");
    
	int i;
    for(i = 0; i < 5; i++){
    	printf("%s\n",nomes[i]);
	}
	//mostrar a letra 'm' de "Joaquim"
	printf("%c\n",nomes[0][6]);
	
	//Mostrar o código ascii da letra "a" e "b"
	printf("%d\n",'a');
	printf("%d\n",'b');
	int ascii;
	char letra;
	printf("Digite algum número:\n");
	scanf("%c",&letra);
	printf("%c\n",letra);
}
