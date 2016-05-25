#include<stdio.h>
#include<conio.h>

int impar_par_b (int numero){
	if(numero%2==0){
		return 0;
	}else{
		return 1;
	}
	
}


int main(){
	int impar_par,numero;		
	printf("Digite os numero");
	scanf("%i",&numero);	
	
	impar_par = impar_par_b(numero);
	printf("par 0 impar 1 -  %i",impar_par);
}

 
 

