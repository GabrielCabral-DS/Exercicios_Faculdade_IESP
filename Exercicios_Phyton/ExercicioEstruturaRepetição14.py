#Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números impares.

lista = []
lista2 = []
for c in range(1, 11):
    num = int(input(f'Informe o {c} número: '))
    if num % 2 == 0:
        lista.append(num)
    else:
        lista2.append(num)
print(f'Os números pares digitados foram: {lista} e os números ímpares digitados foram: {lista2}')