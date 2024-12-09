package Metodos2;

import java.util.Scanner;

public class Exec02 {

    public static void imprimirQuadrado(int numero) {
        int quadrado = numero * numero;
        System.out.println("O quadrado de " + numero + " é: " + quadrado);
    }

    public static void main(String[] args) {

        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Descubra o quadrado de um número!");

            System.out.print("Digite um número: ");
            int num = leitor.nextInt();

            imprimirQuadrado(num);
        }
    }
}

