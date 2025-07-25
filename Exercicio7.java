import java.util.Scanner;

public class Exercicio7 {


    public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);

            int num, maior, menor;
            int pares = 0;
            int impares = 0;

            System.out.print("Digite o primeiro número: ");
            num = Integer.parseInt(scanner.nextLine());

            // Inicializa maior e menor com o primeiro número
            maior = num;
            menor = num;

            // Verifica se é par ou ímpar
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            // Repetição para os próximos 10 números (total de 11)
            for (int i = 2; i < 11; i++) {
                System.out.print("Digite o próximo número: ");
                num = Integer.parseInt(scanner.nextLine());

                if (num > maior) {
                    maior = num;
                }

                if (num < menor) {
                    menor = num;
                }

                if (num % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }

            System.out.printf("O maior número é: %d\n", maior);
            System.out.printf("O menor número é: %d\n", menor);
            System.out.printf("Quantidade de números pares: %d\n", pares);
            System.out.printf("Quantidade de números ímpares: %d\n", impares);

            scanner.close();
        }
    }

