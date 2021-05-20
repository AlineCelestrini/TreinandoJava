package EstruturasDeControle;


import java.util.Scanner;

public class DesafioSomadorNUm {
    public static void main(String[] args) {
/**7. Criar um programa que enquanto estiver recebendo números positivos, imprime no console a soma dos números inseridos,
 * caso receba um número negativo, encerre o programa. Tente utilizar a estrutura do while.*/

        Scanner entrada = new Scanner(System.in);

        int numero=0;
        int somadorNumeros = 0;

        while (numero >=0) {
            System.out.println("Digite um número inteiro (negativo para sair): ");
            numero = entrada.nextInt();
            if (numero >= 0) {
                somadorNumeros += numero;
                System.out.printf("\n Soma até o momento: %d\n", somadorNumeros);
            }
        }
        entrada.close();
    }
}
