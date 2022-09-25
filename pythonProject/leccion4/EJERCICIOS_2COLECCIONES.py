#Ejercicio 2: Operaciones de conjuntos con listas
# Escriba un programa que tenga 2 listas y que a continuacion
#cree las siguientes listas (en las que no deben hacer repeticion)
# 1 Listas de palabras que aparecen en las listas
# 2 Listas de palabras que aparecen en la primera lista, pero no en la segunda
# 3 Listas de palabras que aparecen en la segunda lista, pero no en la primera
# 4 Listas de palabras que aparecen ambas listas

lista1 = [1, 2, 3, 4, 5, 3, 2, 2, 1, 5]
lista2 = [4, 5, 6, 7, 8, 4, 5, 6, 7, 7, 8]

#Eliminar los elementos repetidos de ambas listas con conjuntos
conjunto1 = set(lista1)
conjunto2 = set(lista2)

union = list(conjunto1 | conjunto2) #union de los dos conjuntos
solo1 = list(conjunto1 - conjunto2) #solo muestra el conjunto1
solo2 = list(conjunto2 - conjunto1) # solo muestra el conjunto2
interseccion = list(conjunto2 & conjunto1) #mostramoslos elementos que coinciden en  ambas listas

print(f"Listas de palabras que aparecen en las listas: {union}")
print(f"Listas de palabras que aparecen en la primera lista, pero no en la segunda: {solo1}")
print(f"Listas de palabras que aparecen en la segunda lista, pero no en la primer: {solo2}")
print(f"Listas de palabras que aparecen ambas listas: {interseccion}")
