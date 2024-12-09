package Metodos2;

import java.util.Scanner;
import java.math.BigInteger;

public class Exec06 {

    public static boolean EhPrimo(int num) {
        BigInteger testePrimo = new BigInteger(String.valueOf(num));

        return testePrimo.isProbablePrime(1);
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero e descubra se ele e primo");
        System.out.println("---------------------------------------------");

        System.out.print("Digite o numero: ");
        int numero = leitor.nextInt();

        System.out.println(EhPrimo(numero));

        leitor.close();
    }

}

