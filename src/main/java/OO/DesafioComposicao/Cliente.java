package OO.DesafioComposicao;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    final String nome;
    Compra compra;

    Cliente (String nome){
        this.nome=nome;
    }

    final List<Compra> compras = new ArrayList<>();

    double obterValorTotal(){
        double total = 0;
        for (Compra c: compras) {
            total += c.obterValorTotal();
        }
        return total;
    }

    void adicionarCompra(Compra compra){
        this.compras.add(compra);

    }
}
