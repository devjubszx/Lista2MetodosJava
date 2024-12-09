package Metodos2;
import java.util.Scanner;

public class Exec03 {

    public static float calcularAreaRetangulo(float largura, float altura) {
        return largura*altura;
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a largura e altura do retangulo para descobrir sua area");
        System.out.println("------------------------------------------------------------------");

        System.out.print("Digite a largura (Cm): ");
        float largura = leitor.nextFloat();

        System.out.print("Digite a altura (Cm): ");
        float altura = leitor.nextFloat();

        System.out.println("A area do retangulo e igual a: "+calcularAreaRetangulo(largura,altura)+" Cm");

        leitor.close();


    }

}

