#include <stdio.h>
#include <stdlib.h>


int main(int argc, char *argv[]) {
	char frase[50];
	char letras[6] = {'A','E','I','O','U'};
	int i,m;
	
	printf("Digite a Frase\n");
	gets(frase);
	printf("\n");
	

	for(i = 0 ;i < strlen(frase);i++){
		for(m=0;m < 2;m++){
			printf("%c",frase[i]);	
		}
	}

}
