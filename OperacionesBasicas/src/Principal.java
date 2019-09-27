
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese a: ");
        double a = s.nextDouble();
        System.out.println("Ingrese b: ");
        double b = s.nextDouble();
        
        OperacionesBasicas op = new OperacionesBasicas();
        System.out.println(op.Suma(a, b));
    }
}
