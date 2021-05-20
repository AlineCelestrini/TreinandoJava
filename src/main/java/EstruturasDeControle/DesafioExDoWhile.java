package EstruturasDeControle;

import java.util.Random;
import java.util.Scanner;

public class DesafioExDoWhile {

    /**
     * 6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um número aleatório em uma variável.
     * O Jogador tem 10 tentativas para adivinhar o número gerado. Ao final de cada tentativa, imprima a quantidade de
     * tentativas restantes, e imprima se o número inserido é maior ou menor do que o número armazenado.
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        int qtTentativas;
        int numSorteado;
        int continuar;


        do {
            System.out.println("Jogo da adivinhação: Tentar adivinhar um número entre 0 e 100: ");
            Random numAleat = new Random();
            numSorteado = numAleat.nextInt(101);
            qtTentativas = 0;

            do {
                qtTentativas++;
                System.out.printf("Tentativa %d: ", qtTentativas);
                numero = entrada.nextInt();

                if (numero > numSorteado) {
                    System.out.printf("\n O número sorteado é menor que %d \n\n", numero);
                } else if (numero < numSorteado) {
                    System.out.printf("\n O número sorteado é maior que %d \n\n", numero);
                } else {
                    System.out.printf("\n Parabéns! Você acertou o número em %d tentativas! \n\n", qtTentativas);
                }

            } while (numero != numSorteado);
            System.out.println("Digite 0 para sair, ou qualquer outro número para continuar: ");
            continuar = entrada.nextInt();
        } while (continuar != 0);

        entrada.close();
    }
}
