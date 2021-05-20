package EstruturasDeControle;

import java.util.Scanner;

public class DesafioWhile2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int qtDeNotas = 0;
        double nota = 0;
        double total = 0;

        while (nota!= -1){
            System.out.print("Informe a nota ou -1 para sair: ");
            nota = entrada.nextDouble();

            if (nota <= 10 && nota >=0){
                total += nota;
                qtDeNotas++;
            }else if(nota !=-1){
                System.out.println("Nota Inválida!!");
            }
        }
        //calcular a média
        double media = total/qtDeNotas;
        System.out.println("Média = " + media);
        entrada.close();
    }
}
