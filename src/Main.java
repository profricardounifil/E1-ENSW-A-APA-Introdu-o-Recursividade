import java.util.Scanner;

public class Main {

    public static void contarRegressivamenteRecursivo(int n) {
        System.out.println(n);
        if(n == 0) {
            return;
        }
        contarRegressivamenteRecursivo(n-1);
    }

    public static int converterParaNumeroNatural(int n, Scanner scanner) {
        do {
            System.out.println("Informe um número natural: ");
            n = scanner.nextInt();
        } while(n < 0);
        return n;
    }

    public static int converterNumeroNaturalR(int n, Scanner scanner) {7
        if(n >= 0) {
            return n;
        }
        System.out.println("Informe um número natural: ");
        n = scanner.nextInt();
        return converterNumeroNaturalR(n, scanner);
    }

    public static int lerNumero(Scanner scanner) {
        System.out.println("Informe um número natural: ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int numeroNatural = 0;
        Scanner scanner = new Scanner(System.in);
        numeroNatural = lerNumero(scanner);
        if(numeroNatural < 0) {
            numeroNatural = converterParaNumeroNatural(numeroNatural, scanner);
        }
        contarRegressivamenteRecursivo(numeroNatural);
    }
}