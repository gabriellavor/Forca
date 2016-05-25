#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int m,n,soma = 0;
	int matriz[4][5] = {{5,1,2,3},
				{0,1,2,3},
				{0,1,2,3},
				{0,1,2,3},
				{8,1,2,3}};								
	
	for(m = 0; m < 4; ++m){
		for (n = 0;n <5;n++){
			soma += matriz[m][n];
		}
		printf("\n");
	}
	printf("Soma dos elementos %i ",soma);
}
