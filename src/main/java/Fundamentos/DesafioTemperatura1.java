package Fundamentos;

import java.util.Scanner;

public class DesafioTemperatura1 {
    public static void main(String[] args) {
      //1. Crie um programa que leia a temperatura em Celsius e converta para Fahrenheit.

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a temperatura em Celsius: ");
        double celsius = entrada.nextDouble();

        double conversao = (celsius*9/5)+32;

        System.out.println("Temperatura em Fahrenheit é: " + conversao + "ºF");
        entrada.close();
    }
}
