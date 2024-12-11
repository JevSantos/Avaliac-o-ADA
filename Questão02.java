//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import java.util.Scanner;
public class Questão02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de alunos: ");
        int quantidadeAlunos = scanner.nextInt();
        scanner.nextLine();
        String[] nomes = new String[quantidadeAlunos];
        double[] notas = new double[quantidadeAlunos];
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
            System.out.print("Digite a nota de " + nomes[i] + ": ");
            notas[i] = scanner.nextDouble();
            scanner.nextLine();
        }
        double somaDasNotas = 0;
        for (double nota : notas) {
            somaDasNotas += nota;
        }
        double media = somaDasNotas / quantidadeAlunos;
        System.out.printf("Média da turma: %.2f\n", media);
        System.out.println("Alunos com notas acima da média:");
        for (int i = 0; i < quantidadeAlunos; i++) {
            if (notas[i] > media) {
                System.out.println(nomes[i] + " - Nota: " + notas[i]);
            }
        }

        scanner.close();
    }
}