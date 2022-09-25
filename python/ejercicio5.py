#calcular el factorial de un nomero mayor o igual a cero.
numero=int(input("ingrese el numero mayor o igual a cero:  "))

factorial=1
i=1

if numero != 0:
    for i in range(1,numero+1):
        factorial=factorial*i
print("factorial:",factorial)