package Metodos2;
import java.util.Scanner;

public class Exec05 {

    public static int obterMenorNumero(int num01, int num02, int num03) {

        if(num02 > num01 && num03 > num01 ) {
            return num01;
        }
        else if(num01> num02 && num03> num02) {
            return num02;
        }
        else {
            return num03;
        }
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Escreva 3 numeros e descubra o menor");
        System.out.println("-------------------------------------");

        System.out.print("Primeiro numero: ");
        int numero01 = leitor.nextInt();

        System.out.print("Segundo numero: ");
        int numero02 = leitor.nextInt();

        System.out.print("Terceiro numero: ");
        int numero03 = leitor.nextInt();


        System.out.println("O menor numero digitado foi: "+obterMenorNumero(numero01,numero02,numero03));


        leitor.close();
    }

}
