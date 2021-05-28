package OO.DesafioComposicao;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    final List<Item> itens = new ArrayList<>();

    void adicionarItem(String nome, double preco, int qtd){
        this.itens.add(new Item(nome,preco,qtd));
    }

    double obterValorTotal(){
        double total=0;
        for (Item item: itens){
            total += item.qtd * item.preco;
        }
        return total;
    }

}
