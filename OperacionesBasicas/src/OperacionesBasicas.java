public class OperacionesBasicas {
    
    public double Suma(double a, double b){
        if (a!=0 && b!=0){
            return a+b;
        }else{
            return 0;
        }
    }
    public double Resta(double a, double b){
        if (a>b){
            return a-b;
        }else{
            return 0;
        }
    }
    public double Multiplicacion(double a, double b){
        if(b!=0){
            return a*b;
        }else{
            return 1;
        }
    }
    public double Division(double a, double b){
        if(b!=0){
            return a/b;
        }else{
            return 0;
        }
    }
}
