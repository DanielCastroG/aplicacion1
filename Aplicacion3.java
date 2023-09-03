
package aplicacion1;


public class Aplicacion3 {
    public static void main(String[] args) {
    try{
        System.out.println("Inicializando la variable n1 con el valor máximo de enteros +1");
        
        // Almacenamos el valor Integer.MAX_VALUE + 1
        int n1 = Integer.MAX_VALUE + 1;
        
        // Imprimir el valor resultante
            System.out.println("El numero es = " + n1);
        }
        catch(Exception e){
            System.out.println(e);            
        }    
    }
}
