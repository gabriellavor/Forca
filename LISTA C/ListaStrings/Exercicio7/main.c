#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(void) {
	char frase[50];
	int i,m,qtd_diferente = 0,igual;	
	
	printf("Digite a Frase\n");
	gets(frase);
	printf("\n");
	
	
	for(i = 0 ;i < strlen(frase);++i){
		igual = 0;
		for(m = 0 ;m < strlen(frase) ;m++){					
		
			if(frase[m] == frase[i] && m != i){
				igual = 1;
			}
		
		}

		if(igual == 0){
			qtd_diferente += 1;
		}
	}
	printf("\n %i",qtd_diferente);
}
