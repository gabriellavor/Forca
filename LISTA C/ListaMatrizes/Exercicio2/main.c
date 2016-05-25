#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(void) {
	int m,n;
	int matriz[10][10] = {{0,1,2,3,4,5,6,7,8,9},
				{0,1,2,3,4,5,6,7,8,9},
				{0,1,2,3,4,5,6,7,8,9},
				{0,1,2,3,4,5,6,7,8,9},
				{0,1,2,3,4,5,6,7,8,9},
				{0,1,2,3,4,5,6,7,8,9},
				{0,1,2,3,4,5,6,7,8,9},
				{0,1,2,3,4,5,6,7,8,9},
				{0,1,2,3,4,5,6,7,8,9},
				{0,1,2,3,4,5,6,7,8,9},
				{0,1,2,3,4,5,6,7,8,9}};								
	
	for(m = 0; m < 10; ++m){
		for (n = 0;n <10;n++){
			if(m != n ){
				printf(" %i ",matriz[m][n]);
			}else{
				printf("   ");
			}
		}
		printf("\n");
	}
}
