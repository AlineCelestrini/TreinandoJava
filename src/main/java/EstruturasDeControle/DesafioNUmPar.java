package EstruturasDeControle;

import java.util.Scanner;

public class DesafioNUmPar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = entrada.nextInt();

        if (num % 2 == 0 && num >=0 && num <=10) {
            System.out.println("Número par e está entre 0 e 10.");
        }else
            System.out.println("Número inválido.");
        entrada.close();
    }
}
