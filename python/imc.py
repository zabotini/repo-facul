print("Digite seu peso em quilos, separado por ponto (ex: 78.5) ")
peso = float(input("Seu peso: "))

print("Digite sua altura em metros, separado por ponto (ex: 1.81)")
altura = float(input("Sua altura: "))

print("seu IMC é: ", peso / (altura / 100) ** 2)
