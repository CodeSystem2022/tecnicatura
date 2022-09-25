#Ejercicio 3: Insertar elementos y ordenarlos
#pedir numeros y meterlos en una lista, cuando el usuario
#introduzca un numero 0, nuestro programa dejaria de insertar
#Por ultimo, mostrar los numeros de ordenados de menor a mayor

lista = []
#creamos una bandera
salir = False
while not salir:
    numero = int(input('Digite un numero: '))
    if numero == 0:

        salir = True
    else:
        lista.append(numero)
lista.sort() #la lista queda ordenada con esta funcion sort
print(f'\nLista ordenada: \n{lista}')
