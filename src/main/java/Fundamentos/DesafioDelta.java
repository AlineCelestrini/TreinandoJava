package Fundamentos;

import java.util.Scanner;

public class DesafioDelta {
    public static void main(String[] args) {
        //6.Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara.
        // Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta
        Scanner entrada = new Scanner(System.in);

        System.out.println("Equação: ax² + bx + c = 0 ");
        System.out.print("Digite o valor de A: ");
        int a = entrada.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = entrada.nextInt();

        System.out.print("Digite o valor de C: ");
        int c = entrada.nextInt();

        int delta = (b*b)-4*a*c;

        System.out.printf("Sua equação é: % dx² + % dx +% d = 0 ", a, b, c);
        System.out.print("\nO Delta é: " + delta);

        double x1 = (-b + Math.sqrt((delta))/(2*a));
        System.out.printf("\nO x1 da equação é: % .2f", x1);

        double x2 = (-b - Math.sqrt((delta))/(2*a));
        System.out.printf("\nO x2 da equação é: % .2f", x2);
        entrada.close();
    }
}
