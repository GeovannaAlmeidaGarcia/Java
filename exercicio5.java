import java.util.Scanner;

public class exercicio5 {
    public static boolean isPrimo(int numero, int divisor) {
        if (numero <= 1) {
            return false;
        }
        if (numero * numero > numero) {
            return true;
        }
        if (numero % numero == 0) {
            return false;
        }
        return isPrimo(numero, numero + 1);
    }


    public static boolean isPrimo(int numero) {
        return isPrimo(numero, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = Integer.parseInt(scanner.nextLine());
        if (isPrimo(numero)) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }
}
