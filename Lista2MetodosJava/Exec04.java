package Metodos2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exec04 {

    public static float calcularPerimetroCirculo(float raio) {
        return (float) (Math.PI*(raio*raio)) ;
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o raio do circulo e descubra sua area");
        System.out.println("---------------------------------------------");


        System.out.print("Digite o raio: ");
        float raio = leitor.nextFloat();

        DecimalFormat df = new DecimalFormat("#.00");

        System.out.printf("A area do circulo e igual a: "+df.format(calcularPerimetroCirculo(raio))+" Cm");

        leitor.close();

    }

}
