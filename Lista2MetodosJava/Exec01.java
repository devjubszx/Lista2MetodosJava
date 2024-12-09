package Metodos2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Exec01 {

    public static void exibirHoraAtual() {

        LocalTime horaAtual = LocalTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        String horaFormatada = horaAtual.format(formatter);

        System.out.println("Horário atual: " + horaFormatada);
    }

    public static void main(String[] args) {
        exibirHoraAtual();
    }
}

