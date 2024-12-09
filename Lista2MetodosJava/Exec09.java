package Metodos2;

import java.util.Scanner;

public class Exec09 {

    public static String inverterString(String palavraNormal) {

        String palavraInvertida = "";

        for(int i = palavraNormal.length()-1; i >= 0; i--) {
            palavraInvertida += palavraNormal.charAt(i);
        }

        return palavraInvertida;
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Descubra frases ao inverso");
        System.out.println("------------------------------------------");

        System.out.print("Digite aqui: ");
        String palavra = leitor.nextLine();

        System.out.println("A palavra invertida é: "+ inverterString(palavra) );

        leitor.close();
    }

}
