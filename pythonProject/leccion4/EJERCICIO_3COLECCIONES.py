#Ejercicio 3: agregar personajes a una lista
#Escriba un programa donde cree una lista con los siguientes personajes del señor de los Anillos
#Nombre: Aragon
#Clase: Guerrero
#Raza: Dúnadan del norte

#Nombre: Gandalf
#Clase: Mago
#Raza: Istar

#Nombre: Legolas
#Clase: Arquero
#Raza: Elfo Sindar
import pprint

personajes= [] #creamos una lista vacia
#creamos un diccionario
P = {'Nombre': 'Aragon', 'Clase': 'Guerrero', 'Raza': 'Dúanadan del Norte'}
personajes.append(P) #agregamos a la lista un personaje a la lista
P = {'Nombre': 'Gandalf', 'Clase': 'Mago', 'Raza': 'Istar'}
personajes.append(P)
P = {'Nombre': 'Legolas', 'Clase': 'Arquero', 'Raza': 'Elfo Sindar'}
personajes.append(P)

#Tarea agregar por lo menos 3 personajes del señor de los anillos
P = {'Nombre': 'Gollum', 'Clase': 'Dueño del anillo', 'Raza': 'Hobbit'}
personajes.append(P) #agregamos a la lista un personaje a la lista
P = {'Nombre': 'Frodo', 'Clase': 'Portador del anillo', 'Raza': 'Hobbit'}
personajes.append(P)
P = {'Nombre': 'Sam', 'Clase': 'Jardinero', 'Raza': 'Hobbit'}
personajes.append(P)
pprint.pp(personajes)