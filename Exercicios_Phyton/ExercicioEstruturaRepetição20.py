#Altere o programa de cálculo do fatorial, permitindo ao usuário calcular o fatorial várias vezes e limitando o fatorial a números inteiros positivos e menores que 16.

from math import factorial

num = int(input('Informe o número: '))
while True:
    if num > 0 and num < 16:
        num = int(input('Informe o número: '))
        print(f'O fatorial de {num} é :{factorial(num)}')
    else:
        print('O número informado não é um número inteiro nem está entre 0 e 16... FIM DO PROGRAMA!')
        break


