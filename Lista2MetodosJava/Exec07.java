package Metodos2;

public class Exec07 {

    public static int gerarNumeroAleatorio() {
        return (int) (Math.random()*100);
    }

    public static void main(String[] args) {
        System.out.println("Gerando numero aleatorio entre 1 e 100: "+gerarNumeroAleatorio());

    }

}
