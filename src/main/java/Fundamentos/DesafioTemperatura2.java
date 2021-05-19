package Fundamentos;

import java.util.Scanner;

public class DesafioTemperatura2 {
    public static void main(String[] args) {
      //2. Crie um programa que leia a temperatura em Fahrenheit e converta para Celsius.

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a temperatura em Fahrenheit: ");
        double fahre = entrada.nextDouble();

        double conversao = (fahre-32)*5/9;

        System.out.print("Temperatura em Celsius é: " + conversao + "ºC");
        entrada.close();
    }
}
