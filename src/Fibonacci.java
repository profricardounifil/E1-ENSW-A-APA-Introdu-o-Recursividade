import java.util.Scanner;

public class Fibonacci {

    public static int calcularFibonacciIterativo(int numero) {// 2
        int resultado = 0, anterior = 1, anteriorDoAnterior = 0;
        if(numero <=1) {
            return numero;
        } else {
            for (int i = 2; i <= numero; i++) {
                resultado = anterior + anteriorDoAnterior;
                anteriorDoAnterior = anterior;
                anterior = resultado;
            }
        }
        return resultado;
    }

    public static int calcularFibonacciRecursivo(int numero) {
        if(numero <=1) {
            return numero;
        }

        return calcularFibonacciRecursivo(numero-1) + calcularFibonacciRecursivo(numero-2);
    }

    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número para o cálculo do Fibonacci: ");
        numero = scanner.nextInt();
        System.out.println("O Fib(" + numero + ")= " + calcularFibonacciRecursivo(numero));
    }
}
