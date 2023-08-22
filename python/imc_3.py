#Aula prática - 

class Pessoa:
#class variables
    pesoPessoa = 0
    alturaPessoa = 0
    imcPessoa = 0

#constructor
    def __init__(self, peso, altura, imc):
        self.peso = peso
        self.altura = altura
        self.imc = imc

#methods
    def entradaDados(self):
        print("Digite seu peso em quilos, separado por ponto (ex: 78.5): ", end="")
        self.pesoPessoa = float(input())
        print("Digite sua altura em centímetros, sem ponto (ex: 180): ", end="")
        self.alturaPessoa = int(input())

    def calculoIMC(peso, altura):
        aux = peso*pow(2, altura)
        imc = '{0:.3g}'.format(aux)
        return imc[0:4]
    
    def resultado(self):
        print("Seu IMC é: ", self.calculoIMC(self.pesoPessoa, self.alturaPessoa))
        
#main

# create Object
p = Pessoa
#call methods
p.entradaDados(p)
p.resultado(p)
