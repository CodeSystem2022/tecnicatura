

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
   // System.out.println("Valor maximodel byte" + Byte.MAX_VALUE )
    
    
        
    
    }
}
