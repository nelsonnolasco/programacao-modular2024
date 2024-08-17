package exercicio01;
/*
01 - Preencha um vetor de 6 números inteiros a partir da entrada do usuário e, depois,
inverter as posições dos números do vetor. Por exemplo, se o vetor original era 4-8-15-16-23-42,
ao final da execução deve ser apresentado o resultado 42-23-16-15-8-4.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[6];
        preencherVetor(numeros);
        inverterVetor(numeros);
        imprimirVetor(numeros);
    }

    public static void preencherVetor(int[] vetor) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 6 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }
    }

    public static void inverterVetor(int[] vetor) {
        for (int i = 0; i < vetor.length / 2; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[vetor.length - 1 - i];
            vetor[vetor.length - 1 - i] = temp;
        }
    }

    public static void imprimirVetor(int[] vetor) {
        System.out.println("Aqui está o vetor invertido:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
