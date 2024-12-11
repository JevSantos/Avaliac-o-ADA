//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        int consumoMedio = 12; //km/l
        int distanciaAPercorrer = 360; // km
        double precoPorLitro; //R$
        double custoViagem; // R$
        int qtdLitros; // litros

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o preço por litro do combustível");
        precoPorLitro = scanner.nextDouble();
        qtdLitros = (distanciaAPercorrer / consumoMedio);
        custoViagem = qtdLitros * precoPorLitro;

        System.out.printf("Serão necessários %s litros de combustível\n", qtdLitros);
        System.out.printf("O preço toal é  R$ %.2f\n Boa viagem!", custoViagem);
        scanner.close();
        
    }
}