#Ejerciocio 10 no repetir caracteres.
#hacer un programa que pida una cadena por teclado. luego
#meter los caraceteres en una lista, sin repetir caracteres.

cadena = input("ingrese una cadena: ")
lista = []

for i in cadena:
    if i not in lista: #si no esta en lista
        lista.append(i) #lo agregamos a la lista

print(f"\n lista de caracteres sin repetir ninguno : \n {lista} ")

