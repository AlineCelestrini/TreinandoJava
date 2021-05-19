package EstruturasDeControle;

import java.util.Scanner;

public class DesafioIf  {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Informe a média: ");
    double media = entrada.nextDouble();
    if (media <=10 && media >= 7.0) {
        System.out.println("Aprovado. Parabéns!! :)");
    }
    if (media>=5 && media<=6.9 ){
        System.out.println("Recuperação. ;)");
        }
    if (media>=0 && media<=4.9 ){
            System.out.println("Reprovado. :(");
        }
    entrada.close();
    }

}
