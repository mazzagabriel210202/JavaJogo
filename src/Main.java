import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando uma instância da classe Nomes
        Nomes nomes = new Nomes();

        // Estanciando a classe Scanner
        Scanner sc = new Scanner(System.in);

        // Instanciando a classe Random
        Random random = new Random();

        // Loop até que uma das listas esteja vazia
        while (nomes.sizeNomes() > 0 && nomes.sizeNomes2() > 0) {
            // Obtendo um índice aleatório da lista nomes
            int randomIndex1 = random.nextInt(nomes.sizeNomes());
            String nomeAleatorio1 = nomes.getNomes(randomIndex1);

            // Obtendo um índice aleatório da lista nomes2
            int randomIndex2 = random.nextInt(nomes.sizeNomes2());
            String nomeAleatorio2 = nomes.getNomes2(randomIndex2);

            // Exibindo os nomes aleatórios
            System.out.println("Nome 1: " + nomeAleatorio1);
            System.out.println("Nome 2: " + nomeAleatorio2);

            // Perguntando ao usuário qual nome ele quer
            System.out.println("Você deve escolher entre os dois nomes na lista. Digite '1' para Nome 1 ou '2' para Nome 2:");
            int escolha;
            try {
                escolha = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite '1' ou '2'.");
                continue; // Repetir o loop sem remover nada
            }

            // Verificando a escolha do usuário e removendo o nome não escolhido
            if (escolha == 1) {
                System.out.println("Você escolheu: " + nomeAleatorio1);
                nomes.removeNome2(randomIndex2);
            } else if (escolha == 2) {
                System.out.println("Você escolheu: " + nomeAleatorio2);
                nomes.removeNome(randomIndex1);
            } else {
                System.out.println("Escolha inválida. Tente novamente.");
                continue; // Repetir o loop sem remover nada
            }

            // Verificando se ainda há nomes nas listas
            if (nomes.sizeNomes() == 0 || nomes.sizeNomes2() == 0) {
                System.out.println("Não há mais nomes disponíveis em uma das listas.");
                break;
            }
        }

        // Fechando o scanner
        sc.close();
    }
}
