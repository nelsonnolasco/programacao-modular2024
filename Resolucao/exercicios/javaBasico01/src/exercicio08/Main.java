package exercicio08;

/*
Sabendo que 1º de janeiro de 2024 foi uma segunda feira, escreva um método que receba uma data e diga em
qual dia da semana esta data acontecerá em 2024. Escreva um programa principal para testar seu método.
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma data no formato dd/MM (por exemplo, 31/12 para 31 de dezembro):");
        String data = scanner.nextLine();

        // Adicione o ano 2024 à data
        data = data + "/2024";

        // Obtenha o dia da semana
        String diaDaSemana = obterDiaDaSemana(data);

        System.out.println("O dia da semana em " + data + " é: " + diaDaSemana);
    }

    public static String obterDiaDaSemana(String data) {
        // Converta a string para LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(data, formatter);

        // Retorne o dia da semana
        return localDate.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("pt", "BR"));
    }
}
