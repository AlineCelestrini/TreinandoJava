package EstruturasDeControle;

import java.util.Scanner;

public class DesafioImpressaoLetra {
    public static void main(String[] args) {
        /**8. Criar um programa que receba uma palavra e imprime no console letra por letra.*/
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = entrada.next();

        char letras [] = palavra.toCharArray();

        for (int i = 0; i< letras.length; i++){
            System.out.println(letras[i]);
        }
        entrada.close();
    }
}
