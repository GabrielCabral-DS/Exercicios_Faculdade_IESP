#Altere o programa anterior para mostrar no final a soma dos números.

n1 = int(input("Digite um numero: "))
n2 = int(input("Digite outro numero: "))
while n2 < n1:

	n1 = int(input("Digite um numero: "))
	n2 = int(input("Digite outro numero: "))

if n2 > n1:
	for i in range(n1, n2, 1):

		print()