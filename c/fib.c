#include <stdio.h>

float fibo (int n) {
    if (n == 0) return 0;
    else {
        if (n == 1) return 1;
        else return fibo(n-1)+fibo(n-2);
    }
}

void main(int argc, char *argv[]) {

int tam = 0;
tam = atoi(argv[1]);
printf("Digite um valor para o tamanho da sua sequência Fibonacci: ");
//scanf("%d",&tam);
printf("\n Sua sequência Fibonacci: %.1f", fibo(tam));

}
