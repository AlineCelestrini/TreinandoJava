package Fundamentos;

import java.util.Scanner;

public class DesafioIMC {
    public static void main(String[] args) {
        //3. Crie um programa que leia o peso e a altura do usuário e imprima no console do IMC.
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o peso: ");
        double peso = entrada.nextDouble();

        System.out.print("Digite a altura: ");
        double altura = entrada.nextDouble();

        double imc = peso/ (altura*altura);

        System.out.print("IMC: " + imc);

        entrada.close();


    }

}
