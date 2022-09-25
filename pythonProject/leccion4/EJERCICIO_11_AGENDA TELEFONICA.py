#EJERCICIO 11 AGENDA TELEFONICA
# HACER UN PROGRAMA QUE SIMULE UNA AGENDA DE CONTACTOS. CREAR DICCCIONARIO DONDE LA CLAVE
# SEA EL NOMBRE DEL USUARIO Y EL VALOR SEA EL NUMERO DE TELEFONO EL PROGRAMA TENDRA EL SIGUENGTE MENU OPCIONES:
#
#       1.NUEVO CONTACTO
#       2 BORRAR CONTACTO
#       3.VER CONTACTOS EXISTENTES
#       4.SALIR

agenda = {}
while True:
    print("\t.:menu:.")
    print("1.NUEVO CONTACTO")
    print("2.BORRAR CONTACTO")
    print("3.VER CONTACTOS EXISTENTES")
    print("4.SALIR")

    opcion = int(input("digite una opcion de menu: "))
    if opcion ==1:
        nombre = input(("Digite el nombre del contacto"))
        telefono = input(("Digite el numero de telefono del contacto"))
        if nombre not in agenda:
            agenda=[nombre]= telefono
            print("contacto agregado exitosamente")
        else:
            print("este nombre de contacto ya existe")
    elif opcion==2:
        nombre=input("cuel es el nombre del contacto")
        if nombre in agenda:
            del (agenda[nombre])
            print("se ha eliminado el contacto requerido")
        else:
            print("Ese contato no existe en la agenda")
    elif opcion== 3 :
        print("Agenda de contacto")
        for clave, valor in agenda.items():
            print(f"nombre :{clave}, telefono: {valor}")
    elif opcion== 4 :
       print("gracias por utilizar su agenda de contactos")
    break
else:
    print("se equivoco de opcion de menu")
















