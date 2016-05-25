#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(void) {
	char frase[50];
	char caractere;
	int i,igual = 0;	
	
	printf("Digite a Frase\n");
	gets(frase);
	printf("Digite o Caractere\n");
	scanf("%c",&caractere);
	printf("\n");
	
	
	for(i = 0 ;i < strlen(frase);++i){
		if(caractere == frase[i]){
			igual += 1;
		}

	}
	if(igual > 0){
		printf("Foi encontrado  %i vezes \n",igual);
	}else{
		printf("Nao Foi encontrado");
	}
	
}
