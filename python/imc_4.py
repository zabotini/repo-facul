class Pessoa:
    #constructor
    def __init__(self, peso, altura):
        self.peso = peso
        self.altura = altura
    #methods
    @staticmethod
    def calculoIMC(peso, altura):
        imc = peso / (altura / 100) ** 2
        return round(imc, 2)

    @classmethod
    def entradaDados(dados):
        peso = float(input("Digite seu peso em quilos, separado por ponto (ex: 78.5): "))
        altura = int(input("Digite sua altura em centímetros, sem ponto (ex: 180): "))
        return dados(peso, altura)

    def resultado(self):
        imc = self.calculoIMC(self.peso, self.altura)
        print("Seu IMC é:", imc)

#create object and call methods
p = Pessoa.entradaDados()
p.resultado()