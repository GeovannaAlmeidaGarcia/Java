import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Número inválido! Digite um número inteiro positivo.");
            return;
        }

        int numeroOriginal = numero;
        int numeroInvertido = 0;

        // Inverter o número sem converter para String
        while (numero > 0) {
            int digito = numero % 10;          // Pega o último dígito
            numeroInvertido = numeroInvertido * 10 + digito;  // Adiciona o dígito invertido
            numero = numero / 10;              // Remove o último dígito
        }

        if (numeroOriginal == numeroInvertido) {
            System.out.println(numeroOriginal + " é um número palíndromo.");
        } else {
            System.out.println(numeroOriginal + " não é um número palíndromo.");
        }

        scanner.close();
    }
}
