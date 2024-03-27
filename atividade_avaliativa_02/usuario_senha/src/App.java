import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String nomeUsuario, senha;

        do {
            System.out.println("Digite o nome de usuário: ");
            nomeUsuario = scanner.nextLine();

            System.out.println("Digite sua senha: ");
            senha = scanner.nextLine();

            if (senha.equals(nomeUsuario)) {
                System.out.println("Erro: A senha não pode ser igual ao nome de usuário!");
            }
        } while(senha.equals(nomeUsuario));

        System.out.println("Usuário registrado com sucesso!");

        scanner.close();
    }
}