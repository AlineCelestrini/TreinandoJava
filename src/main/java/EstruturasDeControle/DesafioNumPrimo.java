package EstruturasDeControle;


//4. Criar um programa que receba um número e diga se ele é um número primo.
//5. Refatorar o exercício 04, utilizando a estrutura switch.

import java.util.Scanner;

public class DesafioNumPrimo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número para saber se é primo: ");
        int num = entrada.nextInt();
        int contDivisores = 0;

        for (int i = 2; i < num; i++){
            if (num % i == 0){
                contDivisores++;
            }
        }

        /*if (contDivisores == 0){
            System.out.println(num + " É primo.");
        }else{
            System.out.println(num + " Não é primo.");
        }*/

        switch (contDivisores){
            case 0:
                System.out.println(num + " É primo.");
                break;
            default:
                System.out.println(num + " Não é primo.");
        }
        entrada.close();
    }
}
