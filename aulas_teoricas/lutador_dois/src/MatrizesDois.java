import java.util.Scanner;

public class MatrizesDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando a matriz para armazenar os nomes dos personagens
        String[][] personagens = new String[2][6];

        // Solicitando ao usuário que insira os nomes dos personagens
        System.out.println("Digite o nome de cada personagem:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("Lutador " + (i * 6 + j + 1) + ": ");
                personagens[i][j] = scanner.nextLine();
            }
        }

        // Exibindo a lista de personagens no formato solicitado
        System.out.println("\nLista de personagens:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(personagens[i][j] + "\t");
            }
            System.out.println();
        }

        // Solicitando ao usuário que insira o nome do lutador que ele pretende usar
        System.out.print("\nDigite o nome do lutador que você pretende usar: ");
        String lutadorEscolhido = scanner.nextLine();

        // Encontrando a posição do lutador escolhido na matriz
        int[] posicaoLutador = encontrarPosicao(personagens, lutadorEscolhido);

        // Calculando a sequência de lutas para o lutador escolhido
        System.out.println("\nSequência de lutas para " + lutadorEscolhido + ":");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                // Ignorar se for o próprio lutador ou se o espaço estiver vazio
                if (!(i == posicaoLutador[0] && j == posicaoLutador[1]) && !personagens[i][j].isEmpty()) {
                    System.out.println(personagens[i][j]);
                }
            }
        }

        scanner.close();
    }

    // Método para encontrar a posição do lutador na matriz
    public static int[] encontrarPosicao(String[][] personagens, String lutador) {
        int[] posicao = new int[2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                if (personagens[i][j].equals(lutador)) {
                    posicao[0] = i;
                    posicao[1] = j;
                    break;
                }
            }
        }
        return posicao;
    }
}
