#Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
num = float(input('Digite uma nota entre 0 e 10: '))
while num < 0 or num > 10:
    print('A nota informada não está entre 0 e 10... Tente novamente..')
    num = float(input('Digite uma nota entre 0 e 10: '))
print(f'A nota informada foi {num}')
