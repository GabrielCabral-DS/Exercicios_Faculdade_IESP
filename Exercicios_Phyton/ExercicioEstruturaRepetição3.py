#Faça um programa que leia e valide as seguintes informações:
#Nome: maior que 3 caracteres;
#Idade: entre 0 e 150;
#Salário: maior que zero;
#Sexo: 'f' ou 'm';
#Estado Civil: 's', 'c', 'v', 'd'
nome = input('Informe o seu nome: ')
idade = int(input('Informe a sua idade: '))
salario = float(input('Informe o seu salário: '))
sexo = str(input('Informe o seu sexo F OU M: ')).upper()
estado_civil = str(input('Informe o seu estado civil Solteiro(s), Casado(c), Viuvo(v), Divorciado(d):')).upper()

while True:

    if len(nome) < 3:
        print('O nome não pode ter menos de 3 caracteres... Tente novamente!!')
        nome = input('Informe o seu nome: ')
    elif len(nome) > 3:
        break

    if idade < 0 and idade > 150:
        print('A idade informada não está dentro dos requisitos... Tente novamente!!!')
        idade = int(input('Informe a sua idade: '))
    elif idade > 0 and idade < 150:
        break

    if salario < 0:
        print('O salário informado não está dentro dos requisitos.. Tente novamente!!!')
        salario = float(input('Informe o seu salário: '))
    elif salario > 0:
        break

    if sexo != ('F', 'M'):
        print('O computador não reconhece esse sexo... Tente novamente!!!')
        sexo = str(input('Informe o seu sexo F OU M: ')).upper()
    elif sexo == ('F', 'M'):
        break

    if estado_civil != ('S', 'C', 'V', 'D'):
        print('O estado civil informado não está correto... Tente novamente!!!')
        estado_civil = str(input('Informe o seu estado civil Solteiro(s), Casado(c), Viuvo(v), Divorciado(d):')).upper()
    elif estado_civil == ('S', 'C', 'V', 'D'):
        break
print(f'Seu nome é {nome}, sua idade é {idade} anos, seu salário é de {salario}R$, O seu sexo é {sexo} e o seu estado civil é {estado_civil}')








