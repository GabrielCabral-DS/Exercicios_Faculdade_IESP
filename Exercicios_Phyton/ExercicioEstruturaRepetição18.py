#Faça um programa que, dado um conjunto de N números, determine o menor valor, o maior valor e a soma dos valores.

maior = menor = quantidade = soma = 0
for c in range(1, 11):
    num = int(input(f'Informe o {c} número: '))
    soma += num
    quantidade += 1
    if quantidade == 1:
        maior = menor = num
    else:
       if num > maior:
           maior = num
       if num < menor:
           menor = num
print(f'O maior valor digitado foi {maior} e o menor valor digitado foi {menor} e a soma dos valores foi {soma}')
