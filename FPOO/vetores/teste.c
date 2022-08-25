#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int i, vetor1[5], vetor2[5];
	
	//primeiro vetor	
	for(i = 0; i < 5; i++){
		printf("Digite o valor do índice %d: ",i);
		scanf("%d", &vetor1[i]);
	}
	printf("\n\n");
	
	//segundo vetor
	for(i = 4; i >= 0; i--){
		printf("Digite o valor do índice %d:  ",i);
		scanf("%d",&vetor2[i]);
		
	}
	
	//resultado
	printf("\n\n");
	for(i = 0; i < 5; i++){
	printf("vetor 1, índice %d: %d",i,vetor1[i]);
	printf("\n\n");
	

}
	for(i = 0; i < 5; i++){
		printf("vetor 2, índice %d: %d",i,vetor2[i]);
			printf("\n\n");

}
}
