#include<stdio.h>
#include<conio.h>

double nado (int idade){
	char categoria[50];
	if(idade >= 5 && idade <= 7){
		strcpy(categoria, "Infantil A");
	}else if(idade >= 8 && idade <= 10){
		strcpy(categoria, "Infantil B");
	}else if(idade >= 11 && idade <= 13){
		strcpy(categoria, "Juvenil A");
	}else if(idade >= 14 && idade <= 17){
		strcpy(categoria, "Juvenil B");
	}else{
		strcpy(categoria, "Adulto");
	}
	printf("categoria e %s",categoria);
}


int main(){
	int anos;
	printf("Digite os anos");
	scanf("%i",&anos);	
	int total = nado(anos);
}
 
 

