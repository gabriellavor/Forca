#include<stdio.h>
#include<conio.h>

double calcula_idade_dias (int anos,int mes,int dias){
	int total_dias;
	total_dias = (anos * 365) + (mes * 30) + dias;
	return total_dias;
}


int main(){
	int anos,mes,dias;
	printf("Digite a os anos");
	scanf("%i",&anos);
	printf("Digite a os meses");
	scanf("%i",&mes);
	printf("Digite os dias");
	scanf("%i",&dias);
	
	int total = calcula_idade_dias(anos,mes,dias);
	printf("Total de dias e %i",total);
}
 
 

