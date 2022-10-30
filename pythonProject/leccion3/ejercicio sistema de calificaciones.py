#ejercicio sistema de calificaciones

calificacion = int(input("digite una calificacion entre 0 a 10: "))

if 9 <= calificacion <= 10:
    print("A")

elif 8 <= calificacion <= 9 :
    print("B")

elif 7 <= calificacion <= 8 :
    print("C")

elif 6 <= calificacion <= 5 :
    print("D")

elif 0 <= calificacion <= 5 :
    print("R")

else:
    print("valor incorrecto...")
