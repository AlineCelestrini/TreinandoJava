package Fundamentos;

import java.util.Scanner;

public class DesafioQuadradoCubo {
    public static void main(String[] args) {
        //4.Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num = entrada.nextDouble();

        double quadrado = Math.pow(num,2);
        System.out.println("O quadrado desse valor é: " + quadrado);
        double cubo =  Math.pow(num,3);
        System.out.println("O cubo desse valor é: " + cubo);

        entrada.close();
    }
}
