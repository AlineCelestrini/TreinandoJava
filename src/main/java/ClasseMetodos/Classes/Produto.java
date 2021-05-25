package ClasseMetodos.Classes;

public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25; //valor atribuído direto na classe.

    Produto(){} //construtor padrão

    Produto(String nomeInicial, double precoInicial){
        nome=nomeInicial;
        preco=precoInicial;
    }

    //pode ser com ou sem parametros
    //a assinatura vai de acordo com o nome e os parametros.
    double precoComDesconto (double descontoGerente){
        return preco * (1- desconto + descontoGerente) ;
    }

    double precoComDesconto (){ //pode ser com ou sem parametros
        return preco * (1- desconto) ;
    }
}
