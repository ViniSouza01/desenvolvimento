#include<stdio.h>
main(){

int par[10], impar[10], num, i, pares = 0, impares = 0;

do{
    printf("\n Digite um numero: ");
    scanf("%d", &num);

        //Verifica se o numero é zero, se já for sai do loop
        if(num == 0) {
            break;  
        }else{
            if (num % 2 == 0){
                par[pares] = num;
                pares++;
            } else {
                impar[impares] = num;
                impares++;
            }
        }
 //Continua a repetir o do enquanto os arrays nao estão preenchidos       
 }while(pares < 10  && impares < 10);

 printf("\n Pares: ");
 for (i=0; i< pares; i++){
    printf("%d ", par[i]); 
 }

 printf("\n Impares: ");
 for (i=0; i<impares; i++){
    printf("%d ", impar[i]);
 }
}
