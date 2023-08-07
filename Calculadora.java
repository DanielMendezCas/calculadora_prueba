public class Calculadora {
    
    public double sum(double a, double b){
        double suma = a + b;
        return suma;
    }
    
    public double rest(double a, double b){
        double resta = a - b;
        return resta;
    }
    
    public String mul(double a, double b){ 
        double multi = a * b;
        return redondo(multi);
    }
    
    public String div(double a, double b){
        double divi = a / b;
        return redondo(divi);
    }
  
    // El metodo toma un numero double y lo formatea para que tenga solo dos decimales para poder redondearlo  
     public static String redondo(double a) {
        return String.format("%.2f", a);
    }
   
}
