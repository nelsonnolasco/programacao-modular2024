package exercicio06;

/*
06	- Um algoritmo para multiplicação rápida por 11 de números de 2 dígitos funciona assim:
para multiplicar 81 x 11, some os dígitos do número (8 + 1 = 9) e insira o resultado entre
os dígitos (891). Se a soma der maior que 9, incremente o dígito da esquerda (vai-um): 56 x 11 = 616.
Escreva um programa que efetue multiplicações por 11 usando este algoritmo.

 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de dois dígitos:");
        int numero = scanner.nextInt();


        // Verifique se o número tem dois dígitos
        if (!verificarNumero(numero)) {
            System.out.println("O número deve ter apenas dois dígitos.");
            return;
        }

        int resultado = multiplicarPor11(numero);
        System.out.println("O resultado da multiplicação por 11 é: " + resultado);
    }

    public static boolean verificarNumero(int numero) {
        return numero >= 10 && numero <= 99;
    }

    public static int multiplicarPor11(int numero) {
        int digitoEsquerdo = numero / 10;
        int digitoDireito = numero % 10;
        int soma = digitoEsquerdo + digitoDireito;

        // Se a soma for maior que 9, incremente o dígito da esquerda
        if (soma > 9) {
            digitoEsquerdo++;
            soma -= 10;
        }

        // Construa o resultado
        return digitoEsquerdo * 100 + soma * 10 + digitoDireito;
    }
}

