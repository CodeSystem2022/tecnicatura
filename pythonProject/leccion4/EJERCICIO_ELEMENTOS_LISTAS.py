#Ejercicio 2: Moificar los elementos de una lista
#Llenar una lista con los numero del 1 al 10, luego modificar
#los elementos de la lista multilicandolos por un valor ingresado por el usuario

lista= list(range(1, 11))
numero = int(input("Digite un valor para mostrar su tabla: "))
for i in lista:
    print(numero, " * ", i, " = ", i * numero)

'''
#hecho por el profe
lista = list(rage(1, 11))
print('lista original')
for i in lista:
print(i, end= '-')
valor =int(input('\Digite un valor a multiplicar: '))
#Multiplicamos todos los elementos de la lista
for indice, i in enumerate(lista): #funcion para modificar los indices de la lista
lista[indice] *= valor #el iterador solo recorre los indices, en esta linea se multiplican

print(f'Lista final con los elementos multiplicados por {valor}')
for i in lista:
    print(i, end= '-')
'''