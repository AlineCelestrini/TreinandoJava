package ArraysECollections;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ExerciciosArrays {
    public static void main(String[] args) {

        double [] notasAlunoA = new double[3];
        System.out.println(Arrays.toString(notasAlunoA));

        notasAlunoA[0]=7.9;
        notasAlunoA[1]=6.7;
        notasAlunoA[2]=8;

        System.out.println(Arrays.toString(notasAlunoA));

        double total = 0;

        //forma mais comum de percorrer um array
        for (int i = 0; i < notasAlunoA.length;i++){
            total += notasAlunoA[i];
        }
        System.out.println(total / notasAlunoA.length);


        //CASO MENOS USUAL DE UTULIZAÇÃO DE UM ARRAY
        final double notaArmazenada = 5.9;
        double [] notasAlunoB = {6.9, 8.9, notaArmazenada, 10}; //tb pode indicar uma variável se for do mesmo tipo do array.

        System.out.println(Arrays.toString(notasAlunoB));

        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++){
            totalAlunoB += notasAlunoB[i];
        }
        System.out.println(totalAlunoB / notasAlunoB.length);
    }
}
