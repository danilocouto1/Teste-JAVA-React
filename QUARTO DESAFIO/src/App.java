import java.util.Scanner;

/**
 * Classe que desembaralha (decifra) linhas impressas incorretamente, onde a
 * metade esquerda de cada linha é impressa a partir do meio da página até a
 * margem esquerda, e a metade direita é impressa a partir da margem direita em
 * direção ao centro.
 * 
 * Desenvolvido por Danilo Couto.
 */
public class App {

    /**
     * Desembaralha (decifra) uma linha impressa incorretamente.
     *
     * @param linha A linha impressa incorretamente
     * @return A frase decifrada na forma original
     */
    public static String desembaralharString(String linha) {
        int meio = linha.length() / 2;
        String parteEsquerda = linha.substring(0, meio);
        String parteDireita = linha.substring(meio);

        StringBuilder sb = new StringBuilder();
        for (int i = meio - 1; i >= 0; i--) {
            sb.append(parteEsquerda.charAt(i));
        }
        for (int i = parteDireita.length() - 1; i >= 0; i--) {
            sb.append(parteDireita.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o total de linhas: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite a frase a decriptar: ");
            String linha = scanner.nextLine();
            String fraseDecifrada = desembaralharString(linha);
            System.out.println("O resultado é :");
            System.out.println(fraseDecifrada);
        }

        scanner.close();
    }
}
