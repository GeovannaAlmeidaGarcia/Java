import java.util.Scanner;

public class Exercicico8 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número positivo: ");
            int num_digitado = Integer.parseInt(scanner.nextLine());

            // Enquanto o número for negativo, continue pedindo um novo número
            while (num_digitado < 0) {
                System.out.println("Número inválido! Digite um número positivo.");
                System.out.print("Digite outro número: ");
                num_digitado = Integer.parseInt(scanner.nextLine());
            }

            int soma = 0;

            // Soma todos os números até num_digitado
            for (int i = 1; i <= num_digitado; i++) {
                soma += i;
            }

            System.out.println("A soma de todos os números de 1 até " + num_digitado + " é: " + soma);

            scanner.close();
        }
    }


