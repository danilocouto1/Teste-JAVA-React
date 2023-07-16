import java.util.Arrays;
import java.util.Scanner;

/**
 * Classe que conta o número de pares em um array de inteiros em que a diferença
 * entre os elementos seja igual a um valor alvo.
 * 
 * Desenvolvido por Danilo Couto.
 */

public class App {

    /**
     * Conta o número de pares no array de inteiros em que a diferença entre os
     * elementos seja igual ao valor alvo.
     *
     * @param k   O valor alvo
     * @param arr O array de inteiros
     * @return O número de pares que satisfazem o critério
     */
    public static int contarPares(int k, int[] arr) {
        // Ordenar o array em ordem crescente
        Arrays.sort(arr);

        int count = 0;
        int left = 0;
        int right = 1;

        while (right < arr.length) {
            int diff = arr[right] - arr[left];

            if (diff == k) {
                count++;
                right++;
            } else if (diff > k) {
                left++;
            } else {
                right++;
            }

            if (left == right) {
                right++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite Tamanho do array: ");
        int tamanhoArry = scanner.nextInt();

        int[] arr = new int[tamanhoArry];

        System.out.print("Digite Valor alvo: ");
        int k = scanner.nextInt();

        for (int i = 0; i < tamanhoArry; i++) {
            System.out.print("Digite os valores do array: ");
            int valoresArray = scanner.nextInt();
            arr[i] = valoresArray;
        }

        int numPares = contarPares(k, arr);
        System.out.println("Número de pares com diferença igual a " + k + ": " + numPares);
        scanner.close();
    }
}
