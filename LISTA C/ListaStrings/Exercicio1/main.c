#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(void) {
	char frase[50];
	char vogais[6] = {'A','E','I','O','U'};
	int i,m,tem_vogal;
	
	printf("Digite a Frase\n");
	scanf("%s",&frase);
	printf("\n");
	
	printf("Frase Criptografada \n");
	for(i = strlen(frase) - 1;i>=0;i--){
		tem_vogal = 0;
		for(m = 0;m < 5;m++){		
			if(vogais[m] == toupper(frase[i])){
				tem_vogal = 1;				
			}				
		}
		
		if(tem_vogal == 1){
			printf("%c",frase[i]);
		}else{
			printf("#");
		}
	}
	
}
