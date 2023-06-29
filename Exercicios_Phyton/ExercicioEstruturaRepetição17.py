#Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120
from math import factorial

for c in range(1, 6):
    num = int(input('Informe o número: '))
    print(f'O fatorial de {num} é :{factorial(num)}')
    resposta = str(input('Você deseja continuar(S) OU (N): ')).upper()
    if resposta != 'S':
       print('FIM DO PROGRAMA!!!')
       break


