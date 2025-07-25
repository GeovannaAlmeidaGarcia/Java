public class Exercicio10 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i + ":");

            for (int num = 1; num <= 10; num++) {
                int resultado = i * num;
                System.out.println(i + " x " + num + " = " + resultado);
            }

            System.out.println();
        }
    }
}
