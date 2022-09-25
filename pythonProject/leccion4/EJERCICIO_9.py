# Ejercicio 9: Mostrar una frase sin espacios y contar su longitud
# Hacer un programa donde el usuario ingrese una frase, se le
# devolverá la misma frase pero sin espacios en blanco,
# y además un contador de cuántos caracteres tiene la frase
# (sin contar espacios en blanco)
# Ejemplo:  frase = vivir por siempre en paz
#           frase final = vivirporsiempreenpaz
#           Nº de caracteres = 21

frase = input("Digite una frase: ")
espacio = " "
for i in frase:
    if i != " ":
        espacio += i
frase = espacio
print(f"\nLa frase sin espacios es: {frase}")
print(f"La frase tiene: {len(frase)}")