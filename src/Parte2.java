import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Parte2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> pessoas = new HashMap<>();

        System.out.print("Digite os nomes e sexos (nome-sexo): ");
        String entrada = scanner.nextLine();

        while (!entrada.isEmpty()) {
            String[] partes = entrada.split("-");
            String nome = partes[0];
            String sexo = partes[1].toUpperCase();

            pessoas.put(nome, sexo);

            System.out.print("Digite o próximo nome e sexo (ou pressione Enter para sair): ");
            entrada = scanner.nextLine();
        }

        Map<String, String> homens = new HashMap<>();
        Map<String, String> mulheres = new HashMap<>();

        for (Map.Entry<String, String> entry : pessoas.entrySet()) {
            if (entry.getValue().equals("M")) {
                homens.put(entry.getKey(), entry.getValue());
            } else {
                mulheres.put(entry.getKey(), entry.getValue());
            }
        }

        System.out.println("Homens:");
        for (Map.Entry<String, String> homem : homens.entrySet()) {
            System.out.println(homem.getKey());
        }

        System.out.println("Mulheres:");
        for (Map.Entry<String, String> mulher : mulheres.entrySet()) {
            System.out.println(mulher.getKey());
        }
    }
}