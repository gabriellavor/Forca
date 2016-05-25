#include <stdio.h>
#include <stdlib.h>


int main(void) {
	char frase[50];
	char caractere;
	char *posicao;
    int index;
	
	printf("Digite a Frase\n");
	gets(frase);
	printf("Digite o Caractere\n");
	scanf("%c",&caractere);
	printf("\n");
	
	posicao = strrchr(frase, caractere);
    index = posicao - frase;
    printf("%d\n",  index);   
    getch();
	
}
