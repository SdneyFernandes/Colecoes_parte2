import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Parte1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os nomes: ");
        String nomes = scanner.nextLine();

        String[] nomesArray = nomes.split("\\s+");

        Arrays.sort(nomesArray, String.CASE_INSENSITIVE_ORDER);

        System.out.print("Nomes em ordem alfabética: ");
        System.out.println(String.join(", ", nomesArray));
    }
}
