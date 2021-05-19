package Fundamentos;

import java.util.Scanner;

public class DesafioTriangulo {
    public static void main(String[] args) {
        //5.Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a Base: ");
        double base = entrada.nextDouble();

        System.out.print("Digite a Altura: ");
        double altura = entrada.nextDouble();

        double area = (base*altura)/2;
        System.out.print("A área do triângulo é: " + area);
        entrada.close();
    }
}
