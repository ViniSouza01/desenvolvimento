#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {

    int i = 0, j, igual, vet[10];

    srand(time(NULL));

    do{ // faça
        vet[i] = rand() % 10; // sorteia um número
        igual = 0;
        for(j = 0; j < i; j++){ // percorre a parte do vetor já preenchida
            if(vet[j] == vet[i])
                igual = 1; // número repetido
        }

        if(igual == 0) // significa que o elemento não se repetiu
            i++;
    }while(i < 10); // enquanto não for sorteado 25 números diferentes

    for(i = 0; i < 10; i++){
        printf("%d ", vet[i]);
    }
    printf("\n\n");

    return 0;
}
