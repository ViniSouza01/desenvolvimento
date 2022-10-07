#include<stdio.h>
#include<stdbool.h>
#include<locale.h>
bool valores (int v1,int v2);
int main (int aegc, char *argv[]){
	setlocale(LC_ALL,"");
	printf("%d",valores(3979,3978));
	return 0;
}
bool valores(int v1,int v2){
	if(v1 == v2){
		return true;
	}else{
		return false;
	}
	return valores;
}
