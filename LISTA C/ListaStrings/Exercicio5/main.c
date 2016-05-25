#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main() {
	char frase[50];
	char frase2[50];
	int i,m,existe;
	
	printf("Digite a Frase\n");
	gets(frase);
	printf("\n");
	printf("Digite a outra Frase\n");
	gets(frase2);
	printf("\n");
		
	for(i = 0 ;i < strlen(frase);i++){
		existe = 0;
		for(m=0;m < strlen(frase2);m++){			
			if(toupper(frase2[m]) == toupper(frase[i]) ){	
				frase2[m] = '%';
				existe = 1;
				break;
			}
		}
		if(existe == 0){
			printf("NAO E uma permutacao\n");
			break;
		}
	}
	if(existe == 1){
		printf("E uma permutacao\n");
	}
	
}
