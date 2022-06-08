#ejercicio etapas de la vidad segun la edad

edad = int(input("digite su edad "))
mensaje = None
if 0 <=edad < 10:
    mensaje= "la infancia es increible y bella"
elif 10<= edad<20 :
    mensaje = "tienes muchos cambios muchos que estudiar"
elif 20<= edad<30 :
    mensaje = "amor y comienza el trabajo"

elif 30<= edad<40 :
    mensaje = "sabio como europa pero con toques interesantes"

elif 40 <= edad < 50:
    mensaje = "tienes muchos cambios muchos que estudiar"
elif 50<= edad<60 :
    mensaje = "señor con conocimientos"

else:
    mensaje = "no sos matuzale pone una edad seria"
print(f"tu edad es : ´{edad},{mensaje} ")