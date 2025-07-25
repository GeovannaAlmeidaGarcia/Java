import java.util.Scanner;


public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String original = scanner.nextLine();

        String invertida = inverterString(original);

        System.out.println("String invertida: " + invertida);

        scanner.close();
    }

    public static String inverterString(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }
}
