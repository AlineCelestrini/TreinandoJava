package EstruturasDeControle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
    // Ideal para repetições indeterminadas.
    //while(expressão que retorna true or false) sentença; ou {bloco associado} - se a expressão for verdadeira ele vai
        //ficar repetindo a execução de uma sentença ou do bloco de código.

        Scanner entrada = new Scanner(System.in);

        String valor = "";

        while (!valor.equalsIgnoreCase("sair")){ //coloca uma condição para sair
            System.out.println("Digite: ");
            valor = entrada.nextLine();
        }
        entrada.close();
    }
}
