import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Digite a quantidade de Blobs: ");
        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite a quantidade de suprimento: ");
        int num2 = Integer.parseInt(scanner.nextLine());

        int dias = 0;
        double consumo = 0;

        if(num2 >= num1){
            while (num2 >= num1){
                consumo = num2/4;
                num2 -= consumo;
                dias += 1;
            }
        }
        System.out.printf("O suprimento disponivel é de: %f", consumo);
    }
}
