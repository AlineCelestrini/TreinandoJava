package EstruturasDeControle;

import java.util.Scanner;
//2. Criar um programa informa se o ano atual é um ano bissexto;

public class DesafioAnoBiSsexto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o ano: ");
        int ano = entrada.nextInt();

        int bissexto = ano % 4;

        if (bissexto == 0 ){
            System.out.println(ano + " é um ano bissexto.");
        }else
            System.out.println(ano + " não é um ano bissexto.");
        entrada.close();
    }
}
