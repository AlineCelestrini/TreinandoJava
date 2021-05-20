package EstruturasDeControle;

import java.util.Scanner;

public class DesafioDoWhile {
    //a expressão vem depois do bloco
    //do {bloco de código} while (expressao);

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String texto = "";

        do {
            System.out.println("Você precisa falar as palavras mágicas...");
            System.out.print("Quer sair?");
            texto= entrada.nextLine();
        }while (!texto.equalsIgnoreCase("por favor"));

        System.out.println("Obrigado!");
        entrada.close();
    }
}
