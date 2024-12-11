//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Digite a quantidade de pessoas:");
     int qtdMembros = scanner.nextInt();
     int qtdPedacos;

     System.out.println("Digite a quantidade de fatias:");
     int qtdFatias = scanner.nextInt();
     int fatiasPorMembro = qtdFatias / qtdMembros;
     int sobra =qtdFatias % qtdMembros;

     System.out.println("Cada membro receberá " + fatiasPorMembro + " fatias de pizza.");
     if (sobra > 0) {
            System.out.println("Sobrarão " + sobra + " fatias de pizza.");
         int fatiasAdicionais = qtdMembros - sobra;
         System.out.println("Para dividir igualmente precisa mais " + fatiasAdicionais + "fatias.");
     } else {
         System.out.println("A divisão foi igual, sem sobra.");
     }
        scanner.close();


        }
}