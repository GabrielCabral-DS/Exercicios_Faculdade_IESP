#Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao segundo número. Não utilize a função de potência da linguagem.

n1 = int(input('Informe o primeiro número (Base): '))
n2 = int(input('Informe o segundo número (Expoente): '))
potencia = n1 ** n2
print(f'A potência de {n1} sobre {n2} é:{potencia}')
reposta = str(input('Deseja continuar?: ')).upper()
while reposta == 'S':
    n1 = int(input('Informe o primeiro número (Base): '))
    n2 = int(input('Informe o segundo número (Expoente): '))
    potencia = n1 ** n2
    print(f'A potência de {n1} sobre {n2} é:{potencia}')
    reposta = str(input('Deseja continuar?: ')).upper()
else:
    print('FIM DO PROGRAMA!!')

