#Ejercicio =$: Sumar numeros pares dentro de un rango
#hacer un programa para sumar nuemeros pares dentro de un rango
#ejemplo
#suma de numeros pares del 2 al 30
#suma = 240

i = int(input("Digite un numero inicial del rango a sumar: "))
f = int(input("Digite el numero final del rango a sumar: "))
suma = 0
print("los pares del rango")
while i <= f:
    if i % 2 == 0:
        print(i)
        suma = suma+i
    i += 1
print("La suma de los numeros es: ", suma)