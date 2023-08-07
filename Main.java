import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       // Se crea el objeto cal de la clase Calculadora para acceder a sus metodos y scanner para entrada de datos
        Calculadora cal = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora básica");
        System.out.println("Ingrese el primer operando");
        double n1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo operando");
        double n2 = scanner.nextDouble();
        
        //  Comprueba si algún operador tiene más de un decimal llamando al metodo declarado
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
    //La funcion convierte el numero a cadena y lo separa a aprtir del punto para comprobar si tiene mas de un decimal
    public static boolean compruebaDecimal(double n) {
        int decimales = String.valueOf(n).split("\\.")[1].length();
        return decimales > 1;
    }
}
               