package EstruturasDeControle;

public class DesafioFor {
    public static void main(String[] args) {
        //ideal para estruturas com quantidades determinadas de repetições
        //for(inicialização da variável;expressão;modificação da variável - incremento, decremento, etc) sentença; ou {bloco de código associado}

        for (int contador = 1; contador <= 10; contador++) {
            System.out.printf("i = %d\n", contador);
        }

        //Laço Infinito
//        for(;;) {
//            System.out.println("FIM!");
//        }
    }
}
