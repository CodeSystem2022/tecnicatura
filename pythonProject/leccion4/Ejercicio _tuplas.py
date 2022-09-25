#importar la clase math para poder usar sus funciones
import math
'''
#Dada la siguiente tupla
tupla = (13, 1, 8, 3, 2, 5, 8) #Definimos la tupla
crear una lista que solo incluya los nuemero menores a 5
e imprimirla por consola [1, 3, 2]
'''

tupla = (13, 1, 8, 3, 2, 5, 8)
lista = [] #Definimos la lista
#filtramos los menores a 5
for elemento in tupla:
    if elemento < 5:
        lista.append(elemento)
print(lista)

#Ejercicio de matematicas
#Para sacar la raíz cuadrada de un numero positivo
numero = int(input('Digite un numero: '))
while numero < 0:
    print('Error -> Deberia ser un numero positivo')
    numero = int(input("digite un numero positivo: "))
print(f'\nSu raíz cuadrada es {math.sqrt(numero):.2f}') #.2f es para que solo muestre 2 decimales