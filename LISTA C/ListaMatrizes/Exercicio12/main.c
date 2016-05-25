#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int m,n;
	int matriz_a[4][4];						
	
	int matriz_b[4][4];
	
	int matriz_resultado[4][4];
	
	printf("Digite a matriz A\n");
	for(m = 0; m < 4; ++m){
		for (n = 0;n <4;n++){
			printf("Linha - %i , Coluna - %i ",m,n);
			scanf("%d",&matriz_a[m][n]);
		}
		printf("\n");
	}
	
	printf("Digite a matriz B\n");
	for(m = 0; m < 4; ++m){
		for (n = 0;n <4;n++){
			printf("Linha - %i , Coluna - %i ",m,n);
			scanf("%d",&matriz_b[m][n]);
		}
		printf("\n");
	}
	
	printf("Soma das matrizes\n");				
	for(m = 0; m < 4; ++m){
		for (n = 0;n <4;n++){
			matriz_resultado[m][n] = matriz_a[m][n] + matriz_b[m][n];
			printf(" %i ",matriz_resultado[m][n]);
		}
		printf("\n");
	}
	
}
