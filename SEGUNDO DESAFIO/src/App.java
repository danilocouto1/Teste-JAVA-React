import java.util.Scanner;

/**
 * Classe que calcula a quantidade mínima de notas e moedas necessárias para trocar um valor monetário.
 * 
 * Desenvolvido por Danilo Couto.
 */

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor em reais: ");
        double valor = scanner.nextDouble();

        int centavos = (int) (valor * 100);

        int[] valores = { 10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1 };

        int[] quantidade = new int[valores.length];

        for (int i = 0; i < valores.length; i++) {
            quantidade[i] = centavos / valores[i];
            centavos %= valores[i];
        }

        System.out.println("NOTAS:");
        for (int i = 0; i < 6; i++) {
            System.out.printf("%d nota(s) de R$ %.2f%n", quantidade[i], valores[i] / 100.0);
        }

        System.out.println("MOEDAS:");
        for (int i = 6; i < valores.length; i++) {
            System.out.printf("%d moeda(s) de R$ %.2f%n", quantidade[i], valores[i] / 100.0);
        }

        scanner.close();
    }
}
