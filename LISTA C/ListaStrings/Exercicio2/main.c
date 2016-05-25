#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(void) {
	char frase[50];
	const char procura[2] = " ";
   	char *palavra_quebra;
	
	printf("Digite a Frase\n");
	fgets(frase,50,stdin);
	printf("\n");

   palavra_quebra = strtok(frase, procura);
      
   while( palavra_quebra != NULL ) {
      printf( " %s\n", palavra_quebra );    
      palavra_quebra = strtok(NULL, procura);
   } 
  	
}
