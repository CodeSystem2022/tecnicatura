#calcular estacion del año

mes = int(input("ingrese numero de mes: "))
estacion = None
if mes == 1 or mes == 2 or mes == 3 :
    estacion = "estacion verano"
elif mes == 4 or mes == 5 or mes == 6:
    estacion = "estacion otoño"
elif mes == 7 or mes == 8 or mes == 9 :
    estacion = "estacion invierno"
elif mes == 10 or mes == 11 or mes == 12:
    estacion = "estacion primavera"
else:
    estacion = "no hay coicidencias para el numero de mes"
    print(f"para el mes mes{mes} la estacion es {estacion}")




