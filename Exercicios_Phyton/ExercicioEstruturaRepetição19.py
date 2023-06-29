#Altere o programa anterior para que ele aceite apenas números entre 0 e 1000.

maior = menor = quantidade = soma = 0
num = int(input(f'Informe o número: '))
for c in range(1, 6):
    if num > 0 and num < 1000:
        num = int(input(f'Informe o número: '))
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
