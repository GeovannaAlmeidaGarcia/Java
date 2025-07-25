import java.util.Scanner;

public class Exercicio11 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double medias = 0;
            String nomes = "";
            int qtd_Alunos = 0;
            int qtd_reprovados = 0;
            String repro = "";




            System.out.print("Digite a quantidade de alunos na turma: ");
            qtd_Alunos = Integer.parseInt(scanner.nextLine());


            for (int i = 0; i < qtd_Alunos; i++) {

                System.out.print("Digite o nome do aluno : ");
                nomes = scanner.nextLine();

                System.out.print("Digite a média do aluno: ");
                medias = Double.parseDouble(scanner.nextLine());

                if(medias < 5){
                    qtd_reprovados ++;
                    repro += "O aluno " + nomes + " esta com a média " + medias + "\n";
                }

            }


            System.out.printf("A quantidade de alunos reprovados é %d\n", qtd_reprovados);
            System.out.print(repro);


        }
    }


