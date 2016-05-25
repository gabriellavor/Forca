#include<stdio.h>
#include<conio.h>

double calcula_media (float  nota1,float nota2, float nota3,char tipo){
	float media = 0;
	
	if(tipo == 'A'){
		media = (nota1 + nota2 + nota3 ) / 3;
	}else if(tipo =='H'){
		media = 3 / ((1 / nota1) + (1 / nota2) + (1 / nota3));
	}else if(tipo == 'P'){
		media = (nota1 * 5 + nota2 * 3 + nota3 * 2) / (5 + 3 + 2);
	}
	
	printf("%.1f",media);
	getch();
}


int main(){
	float nota1,nota2,nota3;
	char tipo;
	printf("Digite a primeira nota");
	scanf("%f",&nota1);
	printf("Digite a Segunda nota");
	scanf("%f",&nota2);
	printf("Digite a Terceira nota");
	scanf("%f",&nota3);
	printf("Digite A para aritmetica - P para ponderada e H- para harmonica");
	scanf("%s",&tipo);
	calcula_media(nota1,nota2,nota3,tipo);
}
 
 

