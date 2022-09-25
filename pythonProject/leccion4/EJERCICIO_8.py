#Ejercicio 8: Menú interactivo - Cajero automatico
# Hacer un programa que simule un cajero automatico con un saldo
#inicial de $1000 y tendrá el siguiente menú de opciones:
#                   1. Ingrese dinero en la cuenta
#                   2. Retirar dinero de la cuenta
#                   3. Mostrar dinero disponible
#                   4. Salir

saldo = 0000
while True:
    print()
    print("\t MENÚ")
    print("1. Ingrese dinero en la cuenta")
    print("2. Retirar dinero de la cuenta")
    print("3. Mostrar dinero disponible")
    print("4. Salir")
    print()
    opcion = int(input("Digite una opcion del menú: "))
    print()
    if opcion == 1:
        ingreso = float(input("Digite el monto que desea ingresar: "))
        saldo += ingreso
        print(f"Ingreso ${ingreso} y su saldo actual es ${saldo}")
    elif opcion ==2:
        retiro = float(input("Digite el monto que desea retirar: "))
        if retiro > saldo:
            print("No tiene suficiente saldo en la cuenta")
            print(f"Su saldo disponible: ${saldo}")
        else:
            saldo -= retiro
            print(f"Retiro ${retiro}, su saldo es: {saldo}")
    elif opcion ==3:
        print(f"Su saldo actual es: ${saldo}")
    elif opcion ==4:
        print("\t Muchas Gracias")
        break
    else:
        print("Error se equivoco de opción de menú")
