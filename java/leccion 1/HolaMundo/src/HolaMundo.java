

/** 
 *
 * @author mauri
 */
public class HolaMundo {
    public static void main( String args []){
    System.out.println("hola mundo desde java");
    
    //tipo entero
    int miVariable = 10;
    System.out.println(miVariable);
    
    miVariable = 5 ;
    System.out.println(miVariable);
    
    //tipo string
    
    String miVariableCadena = "bienvenidos";
        System.out.println(miVariableCadena);
        
        miVariableCadena = "sigamos creciendo en programacion";
        System.out.println(miVariableCadena);
           
         
        //Var - Inferencia de tipo en Java
        
    var miVariableEntera2 = 10;
    var miVariableCadena2 = "Seguimos estudiando";
    System.out.print("miVariableEntera2 = "+ miVariableEntera2);
    System.out.print("miVariableCadena2 = "+ miVariableCadena2);
    //soutv + tab
    //Para ejecutar shift+f6
    
    //concatenacion
    
    var usuario = "Tamara";
    var titulo = "Estudiante";
    var union = titulo + " " + usuario;
    System.out.println("union = " + union);
    
    
    var a = 8;
    var b = 4;
    System.out.print(usuario + (a +b)); //sino pongo a + b entre parentesis lo 
    //concatena de izq a derecha, no suma xq 1º hay una cadena
    
   //Ejercicio: Caracteres Especiales con Java
    
    var nombre = "Tamara";
    System.out.println("\nNueva lienea: \n" +nombre); // diagonal inversa + n;
    System.out.println("Tabulador: \t"+ nombre);  //Tabulador un espacio para centrar
    System.out.println("\t\t, :MENÚ:.");
    System.out.println("Retroseso: \b\b"+nombre); //Caracter de Retroseso
    System.out.println("comillas simples: \'"+nombre+"\'");
    System.out.println("Comillas Dobles: \""+nombre+"\"");
    
    /**
    
   //Clase Scanner
    scanner entrada = new scanner(System.in); //hay que importarla para que no de error
    System.out.println("Digite su numbre:");
    var usuario2 = entrada.nextLine(); //un metodo para leer una linea completa que recibio del ususario
    //var ususario2 = "Carlos";
    System.out.println("usuario2 = " + usuario2);
    System.out.println("Escriba el titulo: ");
    var titulo2 = entrada.nextLine();
    System.out.println("Escriba el autor");
    String autor = scanner.nextLine();
    System.out.println (titulo2 + "fue escrito por: "+ autor2);
    System.out.println("Resultado: "+titulo2+" "+usuario2);
      
 *
 * @author mauri
 */
    
    byte numEnteroByte = 127;
    System.out.println("numEnteroByte - " + numEnteroByte);
    System.out.println("valor minimo del byte:" + Byte.MIN_VALUE);
    System.out.println("Valor maximodel byte" + Byte.MAX_VALUE );
    
    /**
    Short numEnteroShort = (short)32768;  // si pongo un numero mayor da error    //si agrego el (short) no salta error pero pierde presicion y da negativo
    Short numEnteroShort = 32767;
    System.out.println("numEnteroShort - " + numEnteroShort);
    System.out.println("valor minimo del Short:" + Short.MIN_VALUE);
    System.out.println("Valor maximodel short" + Short.MAX_VALUE);
    */
    
    //int numEnteroInt = (int)2147483647L; (no salta error pero lo muestra en negativo debo agregar la L para que no salte a demas del int
    int numEnteroInt = 10;
    System.out.println("numEnteroInt - " + numEnteroInt);
    System.out.println("valor minimo del Int:" + Integer.MIN_VALUE);
    System.out.println("Valor maximodel Int" + Integer.MAX_VALUE);
    
    
    long numEnteroLong = 9223372036854775807L; //Es el maximo entero (agrego L para que no de error), si quiero un numer fmayor se usan n flotantes
    System.out.println("numEnteroLong - " + numEnteroLong);
    System.out.println("valor minimo del Long:" + Long.MIN_VALUE);
    System.out.println("Valor maximodel Long" + Long.MAX_VALUE);
    
    float numFloat = 10.0F; //usar mayusculas para mejor comprension, minuscula acepta pero confunde
    //si ponemos un decimal, hay que agregar F para que indique que la literal es float
    // otra forma es indicar al compilador que lo tome  com flotante poninedo (float)
    // se pueden usar ambos o uno solo (float)10F;
    //float numFloat = (float)3.4028236E38D;
    // Si uso un num mayor da error se arregla (float) + D
    System.out.println("numFloat - " + numFloat);
    System.out.println("valor minimo del Float: " + Float.MIN_VALUE);
    System.out.println("Valor maximodel Float: " + Float.MAX_VALUE);
    
    
    
    double numDouble = 10;
    System.out.println("num - " + numDouble);
    System.out.println("valor minimo del Double: " + Double.MIN_VALUE);
    System.out.println("Valor maximodel Double: " + Double.MAX_VALUE);
    
    
    //Inferencia de tipos va y tipos primitivos
    
     /*
    var numEntero = 20; // Las literales automaticamente son de tipo int
    System.out.println("numEntero = " + numEntero);
    var numFloat = 10.0F; // Automaticamente con el puento se transforma en tipo double (F lo toma como float)
    System.out.println("numFloat = " + numFloat);
    var numDouble = 10.0; //
    System.out.println("numDouble = " + numDouble);
    char miVaraiableChar = 'a';
    System.out.println("miVaraiableChar = " + miVaraiableChar);
    
    char varCaracter = '\u0024'; // Indicamos a java con el valor del codigo unicode
    System.out.println("varCaracter = " + varCaracter);
    
    char varCaracterDecimal = 36; // valor decimal del juego de caracteres unicode
    System.out.println("varCaracterDecimal = " + varCaracterDecimal);
    
    char varCaracterSimbolo = '$'; // Un caracter especialm podemos copiar y pegar desde unicode
    System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);
    
     var varCaracter1 = '\u0024'; // Indicamos a java con el valor del codigo unicode
    System.out.println("varCaracter1 = " + varCaracter1);
    
    var varCaracterDecimal1 = (char)36; // valor entero y le asigna un tipo int, agrego char para que si lo tome
    System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
    
    var varCaracterSimbolo1 = '$'; // Un caracter especialm podemos copiar y pegar desde unicode
    System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolo1);
    
    int varEnteroChar = '$';
    System.out.println("varEnteroChar = " + varEnteroChar);
    int caracterChar = 'b';
    System.out.println("caracterChar = " + caracterChar);
 */
     
     
      /*
    //Tipos primitivos tipos booleanos true o false
    boolean varBool = true;
    System.out.println("varBool =" + varBool);
    
    //if (varBool == true) no hace falta por true
    
    if(varBool){
        System.out.println("La bandera es verde");
    }
    else{
        System.out.println("La bandera es roja");
    }
    //Algoritmo : ¿Es mayor de edad?
    
    var edad = 30; //Literal tener presente la interderencia de los tipo
   // var adulto = edad>=18; //Esta es una expresion booleana
    if(edad>=18){ //haciendo así acortamos y lo hacemos mas eficiente
        System.out.println("Eres mayor de edad");
    }
    else{
        System.out.println("eres menor de edad");
        }
         *//*
    //Conversion de tipos primitivos (cadena a tipo entero y viceversa)
    var edad = Integer.parseInt("20");
    System.out.println("edad = "+ (edad+1));
    }
         */
         
         /*
    var edad = "20";
    System.out.println("edad = " + (edad+1));
    var valorPI = Double.parseDouble("3.1416");
    System.out.println("valorPI =" +valorPI);
         */
        //Pedir un valor
        //var entrada = new Scanner(System.in);
        /*System.out.println("Digite su edad:");
    edad = Integer.parseInt( entrada.nextLine());
    System.out.println("edad = "+edad);
         */
        //conversion de tipos primitivos Java parte 2
        /*var edadTexto = String.valueOf(10);
    System.out.println("edadTexto = "+edadTexto);

    var freseChar ="programadores".charAt(4);
    System.out.println("freseChar = " + freseChar);
    
    System.out.println("Digite un caracter: ");
    freseChar = entrada.nextLine().charAt(0);
    System.out.println("freseChar = " + freseChar);
         */
        
        /*
    //sguimos con operadores de asignacion
    int num1 = 5, num2 = 4; //inicio una variable y asigno un valor de tipo entero (int)
    //si quiero poner inferencia de tipos (var) debo hacelo en 2 lineas
    var solucion = num1 + num2; //aca no esta concatenando solo es una operacion aritmetica
    System.out.println("solucion = " + solucion);
    
    solucion = num1 - num2;
    System.out.println("solucion de la resta= " + solucion);
    
    solucion = num1 * num2;
    System.out.println("solucion de la multiplicacion = " + solucion);
    
    solucion = num1 / num2;
    System.out.println("solucion de la division= " + solucion);
    
    var solucion2 = 3.4  / num2;
    System.out.println("solucion2 usando valor flotante= " + solucion2);
    
    solucion = num1 % num2; // Guarda el residuo entero de la division no el resultado
    System.out.println("solucion = " + solucion);
    if (num1 % 2 == 0)
        System.out.println("es un numero par");
    else 
        System.out.println("es un numero impar");
    // no uso llaves en este if xq use una sola linea dentro de cada bloque
         */
        
        /*
    int varNum1 = 1, varNum2 = 4; // operador de asigancion que estoy usando es el =
    int varNum3 = varNum1 + 6 - varNum2; // una operacion
    System.out.println("varNum3 =" + varNum3);
    
    varNum1 +=1; // es lo mismo varNum1 = varNum1 +1;
    System.out.println("varNum1 = " + varNum1);
    
    // hacaerlo con  - * / %
    varNum2 -=2;
    System.out.println("varNum2 = " + varNum2);
        
    varNum1 *=5;
    System.out.println("varNum1 = " + varNum1);
    
    varNum3 /=4;
    System.out.println("varNum3 = " + varNum3);
    
    varNum1 %=6;
    System.out.println("varNum1 = " + varNum1);
         */
        
         /*
    // operadore unarios: Cambio de signo
    var varA = 7; // usamos inferencia de tipo
    var varB = -varA; 
    System.out.println("varA = " + varA);
    System.out.println("varB = " + varB);
    
    //Operadores de Negacion
    var varC = true; // Esta literal por default en Java es de tipo boolean
    var varD = !varC; //Aqui esta invirtiendo el valor (!operador de negacion)
    System.out.println("varC = " + varC);
    System.out.println("varD = " + varD);
    
    // Operadores  unarios de Incremento: Preincremento
    var varE = 9; // se va a modificar su valor
    var varF = ++varE; // Simbolo antes de la variable
    //Pimero se incrementa la variable y despues se usa su valor
    System.out.println("varE = " + varE); //Se incrementa la unidad
    System.out.println("varF = " + varF); //Va a sumar uno
    
    // PostIncremento (el simbolo va despues de la cariable
    
    var varG = 3;
    var varH = varG++; //Primero el valor de la variable y luego el incremento
    System.out.println("varG = " + varG);
    System.out.println("varH = " + varH);
    
    // opradores unarios de decremnto
    var varI = 4;
    var varJ = --varI;
    System.out.println("varI = " + varI); //la variable ya esta con el decremento
    System.out.println("varJ = " + varJ);
    
    //postDEvremento
    var varK = 8;
    var varL = varK--; //primero el valor de la variable y luego el decremento
    System.out.println("varK = " + varK); //Aquí va a decremntar I
    System.out.println("varL = " + varL);
         */
         
         /*
        //operadores de igualdad y relacionales
        var aNum = 5; //ineferencia de tipo var que x default asigna tipo int (entero)
        var bNum = 4;
        var cNum = (aNum == bNum); //esto va a dar True o False (va asiganr un valor bool)
        System.out.println("cNum = " + cNum);

        var dNum = aNum != bNum; //los parentesis son opcionales ultil para la visual
        System.out.println("dNum = " + dNum);

        // == para cadenas no usamos, para objetos no se usa. el tipo string tiene un metod diferente en java
        var cadenaA = "Hello";
        var cadenaB = "bye bye";
        var cVar = cadenaA == cadenaB; //aqui no compara el contenido sino de la rederencia
        System.out.println("cVar = " + cVar);

        //para compara el contenido de una cadena 
        var fVar = cadenaA.equals(cadenaB);
        System.out.println("fVar = " + fVar);

        //var cadenaA = "Hola"; 
        //var cadenaB = "casa"; 
        //var cVar = cadenaA == cadenaB; 
        //System.out.println("cVar = " + cVar); 
        //va a dar verdadero porque la longitud es la misma
        //operadoderes relacionales (inican si es menor igual o mayor o dieferente)
        var gVar = aNum >= bNum; // puedo ir camiando = o < o <= o !=
        System.out.println("gVar = " + gVar);

        if (aNum % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es Impar");
        }
        var edad = 15;
        var adulto = 18; 
        if (edad >= adulto) {
        System.out.println("es mayor de edad");
    }
        else{
            System.out.println("es menor de edad");
        } */
         
         /*
        var valorA = 7;
        var valorMinimo = 0; // creamos rango 0 al 10
        var valorMaximo = 10;
        var respuesta = valorA >= 0 && valorA <= 10;
        if (respuesta) //no hace falta poner respuesta == true
        {
            System.out.println("Esta dentro del rango establescido ");
        } else {
            System.out.println("Esta fuera del rando establecido");
        }
        var vacaciones = false;
        var diaLibre = true;
        if (vacaciones || diaLibre) // ||es or
        {
            System.out.println("Papa puede asistir al juego de su hijo");
        } else {
            System.out.println("Papa no puede asistir al juego de su hijo");
        }*/
         
         /*
        // operador ternario (xq tienq 3 partes) : 
        // 1 condicion a evaluar 
        // 2 nos regresa un valor  
        // 3 regresa otro valor es decie 2 resultados t o F
        var resultadoT = (5 > 4) ? "verdadero" : "Falso";
        System.out.println("resultadoT = "+resultadoT);
        
        var numeroT = 7;
        resultadoT = (numeroT % 2 == 0)? "Es Par" : "Es Impar"; // ? es entoces
        System.out.println("resultadoT = " + resultadoT); */
 
        // prioridad de operadores
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x); //6
        System.out.println("y = " + y); //9
        System.out.println("z = " + z); //16
        
        var solicionaAritmetica = 4 +5 * 6 /3; // 14 = 4 ((5*6) /3)
        System.out.println("solicionaAritmetica = " + solicionaAritmetica);
        
        solicionaAritmetica = (4 +5) * 6 /3; // 18
        System.out.println("solicionaAritmetica = " + solicionaAritmetica);
        
  
    }
}
