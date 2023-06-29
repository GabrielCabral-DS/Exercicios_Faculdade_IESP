#Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro. Depois modifique o programa para que ele mostre os números um ao lado do outro.
for c in range(1, 21):
    print(c)
n = str(input('Gostaria de ver um do lado do outro? S OU N:')).upper()
for d in range(1, 21):
    if n == 'S':
        print(d, end=' ')
    else:
        print('FIM DO PROGRAMA!!!')
        break



