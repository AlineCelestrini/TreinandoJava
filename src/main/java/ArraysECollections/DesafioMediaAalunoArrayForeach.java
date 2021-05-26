package ArraysECollections;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioMediaAalunoArrayForeach {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

      System.out.println("Quantas notas você quer informar?");
      int qtNota = entrada.nextInt();

      double [] notas = new double[qtNota];


      for (int i = 0; i < notas.length ; i++){
          System.out.println("Digite a Nota " + (i + 1) + ": ");
          notas[i] = entrada.nextInt();
      }
      System.out.println(Arrays.toString(notas));

      double total = 0;
        for (double nota: notas) {
            total += nota;
        }
        System.out.println("Sua média é: " + total/qtNota);
      entrada.close();

    }

}
