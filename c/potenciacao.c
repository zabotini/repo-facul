/*  Aluno:           Rafael Zabotini Venjenski             *\
|*  Anhanguera:      Algotitmos e Programação Estruturada  *|
\*  2° Algoritmo:    Apresentar o resultado da potenciação */

#include <stdio.h>
#include <stdint.h>
#include <inttypes.h>

// PROTÓTIPOS
uint64_t entrada_de_dados();
uint64_t captura_base(uint64_t base);
uint64_t captura_expo(uint64_t expo);
uint64_t potencia_recursiva(uint64_t base, uint64_t expo);
uint64_t verifica_overflow(uint64_t aux, uint64_t base);


// MAIN
void main() {
    uint64_t aux;
    uint64_t base = captura_base(base);
    uint16_t expo = captura_expo(expo);
    verifica_overflow(potencia_recursiva(base, expo), base);
}


// FUNÇÕES
uint64_t entrada_de_dados() {
    uint64_t valor;
    scanf("%"PRIu64"", &valor);
    return valor;
}

uint64_t captura_base(uint64_t base){
    printf("Qual a base da sua potenciação? ");
    return base = entrada_de_dados();
}

uint64_t captura_expo(uint64_t expo){
    printf("Qual o expoente da sua potenciação? ");
    return expo = entrada_de_dados();
}

uint64_t potencia_recursiva(uint64_t base, uint64_t expo){
    if (expo > 0) {
        return (base * potencia_recursiva(base, expo-1));
    }
    return 1;
}

uint64_t verifica_overflow(uint64_t aux, uint64_t base) {
    if (aux == 0 && base >0) {
        printf("\nSeu resultado é maior do que posso calcular :(\nPor favor, tente números menores. O limite nominal desse programa é [(2^63)-1]\nque corresponde a 18.446.744.073.709.551.615, são mais de 18 quintilhões!\n\n");
    } else printf("\nSeu resultado é: %"PRIu64".\nObrigado por usar esse programa :)\n\n", aux);
}