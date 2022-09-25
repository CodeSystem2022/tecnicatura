#for elemento in tuple:
#    if elemento < 5:
 #       lista.append(elemento)
  #      print(lista)


#SINTAXIS DE RANGO (INICIO<OPCIONAL> , FIN<REQUERIDO> INCREMENTO<OPCIONAL>)

# ............................................................................ #

#EJERCICIO 1 CREAR UN RANGO DE 0 A 10 IMPRIMIR NUMEROS DIVISIBLES ENTRE 3....EJ: 0,3,6,9....

for i in range (10):
    if i % 3 ==0:
       print(i)


#EJERCICIO 2 CREAR UN RANGO DE 2 A 6 IMPRIMIR....EJ: 2,3,4,5,6...

for i in range(2,7):
    print(i)

##EJERCICIO 3 CREAR UN RANGO DE 3 A 10 CON INCREMENTO DE 2 EN 2 EN LUGAR DE 1 EN 1..

for i in range(3,11,2):
    print(i)
