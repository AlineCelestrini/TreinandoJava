package OO.DesafioComposicao;

public class ClienteTest {
    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 2.45, 5);
        compra1.adicionarItem("Caderno", 16.65, 2);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Livros Paradidáticos", 52.45, 3);
        compra2.adicionarItem("Caderno 10 matérias", 15.65, 7);


        Cliente cliente = new Cliente("Maria Aparecida Silva");
        cliente.adicionarCompra(compra1);
        cliente.adicionarCompra(compra2);

        System.out.println(cliente.obterValorTotal());

    }
}
