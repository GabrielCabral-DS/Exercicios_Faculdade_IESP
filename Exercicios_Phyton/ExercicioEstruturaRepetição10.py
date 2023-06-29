n1 = int(input("Digite um numero: "))
n2 = int(input("Digite outro numero: "))

while n2 < n1:

	n1 = int(input("Digite um numero: "))
	n2 = int(input("Digite outro numero: "))

else:
	for i in range(n1, n2, 1):
		print(i)