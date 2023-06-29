#Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.

popA = int(input('Informe o número de Habitantes A: '))
popB = int(input('Informe o número de Habitantes B: '))
taxaA = float(input('Informe a taxa de crescimento A %: '))
taxaB = float(input('Informe a taxa de crescimento B %: '))
ano = 0

while True:
    if popA < popB:
        ano += 1
        popA += round((popA * taxaA) / 100)
        popB += round((popB * taxaB) / 100)
        print(f'Levará {ano} anos para a população da cidade A ser maior que a população da cidade B ')
        print(f'PopulaçãoB {popB} Habitantes')
        print(f'PopulaçãoA {popA} Habitantes')
        break
    elif popB < popA:
        ano += 1
        popA += round((popA * taxaA) / 100)
        popB += round((popB * taxaB) / 100)
        print(f'Levará {ano} anos para a população da cidade B ser maior que a população da cidade A ')
        print(f'PopulaçãoA {popA} Habitantes')
        print(f'PopulaçãoB {popB} Habitantes')
        break







