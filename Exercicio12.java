import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = 0;
        int a = 1;
        int b = 1;

        System.out.print("Digite o numero: ");
        num1 = Integer.parseInt(scanner.nextLine());


        if (num1 <= 0) {
            System.out.println("Por favor, digite um número inteiro positivo maior que zero.");
        } else {
            System.out.println("Sequência de Fibonacci até o " + num1 + "º termo:");

            for (int i = 1; i <= num1; i++) {
                if (i == 1 || i == 2) {
                    System.out.print("1 ");
                } else {
                    int c = a + b;
                    System.out.print(c + " ");
                    a = b;
                    b = c;
                }
                scanner.close();
            }
        }
    }
}




