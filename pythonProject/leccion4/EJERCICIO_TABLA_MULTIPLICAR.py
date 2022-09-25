#Ejercicio &: Tabla de multiplicar
#Hacer un programa que pida un número por teclado y guarde
# en una lista su tabla de multiplicar hasta el 10. por ejemplo:
# Si digita el 5 la lista tendrá: 5, 10,20,25,30,35,40,45,50

numero = int(input("Digite un numero entero: "))
lista = [] #lista vacia
for i in range(1,11):
    lista.append(i*numero) #aqui guarda cada multiplicación
print(f'\n Tabla de multiplicar del  {numero}: \n{lista}')

#para mostrarlo como tabla de multiplicar
for indice,i in enumerate(lista): #creo otra variable "indice" y uso la funcion enumerate
    print(f'{numero} x {i} = {lista[indice]}')