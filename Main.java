import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculadora cal = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora básica");
        System.out.println("Ingrese el primer operando");
        double n1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo operando");
        double n2 = scanner.nextDouble();

        if (compruebaDecimal(n1) || compruebaDecimal(n2)) {
            System.out.println("Operando incorrecto, tiene más de un decimal");
        }else{
            System.out.println("Ingresa la operación a realizar");
            char operacion = scanner.next().charAt(0);

            switch (operacion) {

                case '+':
                    System.out.println("Resultado: " + cal.sum(n1, n2));
                    break;

                case '-':
                    System.out.println("Resultado: " + cal.rest(n1, n2));
                    break;

                case '*':
                    System.out.println("Resultado: " + cal.mul(n1, n2));
                    break;

                case '/':
                    if (n2 == 0) {
                        System.out.println("Error: No se puede dividir por cero.");
                    } else {
                        System.out.println("Resultado: " + cal.div(n1, n2));
                    }
                    break;

                default:
                    System.out.println("El carácter ingresado no es válido.");
            }
        }
    }
    
    public static boolean compruebaDecimal(double n) {
        int decimales = String.valueOf(n).split("\\.")[1].length();
        return decimales > 1;
    }
}
               