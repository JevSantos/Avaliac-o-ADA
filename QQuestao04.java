import java.util.Scanner;

public class QQuestao04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        boolean eprimo = true;
        if (numero <= 1) {
            eprimo = false;
        } else {
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    eprimo = false;
                    break;
                }
            }
        }
        if (eprimo) {
            System.out.println(numero + " é número primo.");
        } else {
            System.out.println(numero + " não é número primo.");
        }
        scanner.close();
    }
}
