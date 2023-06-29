#Faça um programa que leia 5 números e informe a soma e a média dos números
soma = media = 0
for c in range(1, 6):
    n = int(input(f'Informe o {c} número: '))
    soma += n
    media = soma / c
print(f'A soma dos números foi de {soma} e a média dos números foi de {media}')

