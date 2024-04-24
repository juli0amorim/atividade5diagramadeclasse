import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        // Criando uma instância de Date para representar a data de nascimento
        Date dataNascimento = new Date(90, 0, 15); // Ano 1990, mês Janeiro (0), dia 15

        // Criando uma instância de Pessoa
        Pessoa pessoa1 = new Pessoa("João", dataNascimento, "123.456.789-00");

        // Acessando métodos e atributos da pessoa1
        System.out.println("Informações da Pessoa 1:");
        pessoa1.imprimirInformacoes();
        
        // Modificando o nome da pessoa1
        pessoa1.nome = "José";
        
        // Acessando novamente as informações após a modificação
        System.out.println("\nInformações atualizadas da Pessoa 1:");
        pessoa1.imprimirInformacoes();
    }
}
