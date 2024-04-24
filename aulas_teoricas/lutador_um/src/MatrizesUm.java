import java.util.Scanner;

public class MatrizesUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Receber os nomes dos personagens
        String[] personagens = new String[12];
        for (int i = 0; i < 12; i++) {
            System.out.print("Digite o nome do personagem " + (i + 1) + ": ");
            personagens[i] = scanner.nextLine();
        }
        
        // Imprimir a matriz de personagens
        System.out.println("\nMapa de personagens:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(personagens[i * 6 + j] + "\t");
            }
            System.out.println();
        }
        
        // Pedir ao usuário para escolher um lutador
        System.out.print("\nDigite o nome do lutador que você deseja usar para jogar: ");
        String lutadorEscolhido = scanner.nextLine();
        
        // Gerar a sequência de adversários
        System.out.println("\nRoteiro de luta para " + lutadorEscolhido + ":");
        for (int i = 0; i < 12; i++) {
            if (!personagens[i].equals(lutadorEscolhido)) {
                System.out.println(personagens[i]);
            }
        }
        
        scanner.close();
    }
}
