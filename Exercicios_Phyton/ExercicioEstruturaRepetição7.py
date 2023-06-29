#Faça um programa que leia 5 números e informe o maior número
maior = menor = quantidade = 0
for c in range(1, 6):
    num = int(input(f'Informe o {c} número: '))
    quantidade += 1
    if quantidade == 1:
        maior = menor = num
    else:
       if num > maior:
           maior = num
print(f'O maior valor digitado foi {maior}.')



