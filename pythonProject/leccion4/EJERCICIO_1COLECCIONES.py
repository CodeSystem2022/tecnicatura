# Ejercicio 1: Eliminar dupicados de una lista
# Escriba un programa donde tenga una lista y que a continuacion
# elimine los elementos repetidos, por último mostrar la lista

#creamos una lista

lista = ["Zury", 2, 2, "Tamy", "Tamy", "Sandy", "Zury", "Sandy"]
#conjunto = set(lista) #convierto la lista en un conjunto del tipo set para eliminar los repetidos
#lista = list(conjunto) #convierto el conjunto en una lista
lista = list(set(lista)) #la conversion hecha en una sola linea (eficiente)
print(lista)