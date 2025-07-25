import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("DIgite o numero que você quer a tabuada: ");
        int numero_escolhido = scanner.nextInt();

        int multiplicador = 1;

        while (multiplicador <= 10) {
            int resultado = numero_escolhido * multiplicador;
            System.out.println(numero_escolhido + " x " + multiplicador + " = " + resultado);
            multiplicador ++;
        }
        scanner.close();
    }
}

