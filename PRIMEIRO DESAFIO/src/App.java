import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

/**
 * Classe que ordena valores inteiros não negativos em duas categorias:
 * pares em ordem crescente e ímpares em ordem decrescente.
 * 
 * Desenvolvido por Danilo Couto.
 */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número Linhas: ");
        int numeroLinhas = scanner.nextInt();

        List<Integer> pares = new ArrayList<>();

        List<Integer> impares = new ArrayList<>();

        for (int i = 0; i < numeroLinhas; i++) {
            System.out.print("Digite um número: ");
            int valor = scanner.nextInt();
            if (valor % 2 == 0) {
                pares.add(valor);
            } else {
                impares.add(valor);
            }
        }
        Collections.sort(pares);
        Collections.sort(impares, Comparator.reverseOrder());

        for (int par : pares) {
            System.out.println(par);
        }

        for (int impar : impares) {
            System.out.println(impar);
        }
        scanner.close();
    }
}
