
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese a: ");
        double a = s.nextDouble();
        System.out.println("Ingrese b: ");
        double b = s.nextDouble();
        
        OperacionesBasicas op = new OperacionesBasicas();
        System.out.println("La suma de ambos numeros ingresados es : ");
        System.out.println(op.Suma(a, b));
        
        System.out.println("La resta de ambos numeros ingresados es : ");
        System.out.println(op.Resta(a, b));
        
         System.out.println("La multiplicacion de ambos numeros ingresados es : ");
        System.out.println(op.Multiplicacion(a, b));
        
        System.out.println("La division de ambos numeros ingresados es : ");
        System.out.println(op.Division(a, b));
        
        
    }
}
