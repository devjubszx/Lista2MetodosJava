package Metodos2;

import java.util.Scanner;

public class Exec08 {

    public static float converterCelsiusParaFahrenheit(float celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Conversor de Temperatura Celsius para Fahrenheit");
        System.out.println("-----------------------------------------------------");

        System.out.print("Escreva a temperatura (C): ");
        float celsius = scan.nextFloat();

        System.out.printf("A temperatura convertida e igual a %.2f%s ", converterCelsiusParaFahrenheit(celsius), " F");

        scan.close();

    }

}
