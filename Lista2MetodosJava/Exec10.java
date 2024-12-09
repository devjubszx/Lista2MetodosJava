package Metodos2;
import java.util.Scanner;

public class Exec10 {

    public static float calcularHipotenusa(float cateto01, float cateto02) {

        return (float) Math.sqrt((cateto01 * cateto01 + cateto02 * cateto02));
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite dois catetos e descubra a hipotenusa");
        System.out.println("------------------------------------------------------------------");

        System.out.print("Primeiro cateto (Cm): ");
        float cat01 = leitor.nextFloat();

        System.out.print("Segundo cateto (Cm): ");
        float cat02 = leitor.nextFloat();

        System.out.println("A hipotenusa tem o valor de "+calcularHipotenusa(cat01,cat02)+" Cm");

        leitor.close();
    }

}
