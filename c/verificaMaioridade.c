/*  Aluno:           Rafael Zabotini Venjenski                                                           *\
|*  Anhanguera:      Algotitmos e Programação Estruturada                                                *|
|*  1° Algoritmo:    elaborar o algoritmo que o usuário informe a sua idade e caso a idade seja maior    *|
\*                   ou igual a 18 incluir a mensagem “Maior de idade” e caso contrário “Menor de idade” */

#include <stdio.h>
#define maioridade 18 

//PROTÓTIPOS
int entrada_de_dados();
void verificaMaioridade(int idade);

// MAIN
void main() {
    verificaMaioridade(entrada_de_dados());
}

// FUNÇÕES
int entrada_de_dados() {
    int idade = 0;
    printf("Qual a sua idade? ");
    scanf("%d", &idade);
    if (idade == 0) {
        printf("Algo deu errado. Digite sua idade novamente: ");
        scanf("%d", &idade);
    }
    return idade;
}

void verificaMaioridade(int idade) {
    if (idade >= maioridade) {
        printf("Você é maior de idade. A idade informada é %d e a maioridade é atingida aos %d anos no Brasil.\n\n", idade, maioridade);
    } else if (idade < maioridade && idade > 0){
        printf("Você ainda NÃO é maior de idade. A idade informada é %d e a maioridade é atingida aos %d anos no Brasil.\n\n", idade, maioridade);
    } else {
        printf("Não foi possível capturar sua idade, verifique seu teclado e então rode o programa novamente.\n");
    }
}