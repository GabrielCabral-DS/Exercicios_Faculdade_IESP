#Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.
nome = input('Informe o nome de usuário: ')
senha = input('Informe a senha: ')
while nome == senha:
    print('O nome de Usuário não pode ser igual a senha!!! Tente novamente...')
    nome = input('Informe o nome de usuário: ')
    senha = input('Informe a senha: ')
print('Usuário e Senha cadastrados com Sucesso!!!')