package ClasseMetodos.Classes;

public class ProdutoTest {
    public static void main(String[] args) {

        Produto p1 = new Produto(); //construtor vazio
        p1.nome = "Notebook";
        p1.preco = 3250.90;
        //p1.desconto = 0.10;

        Produto.desconto = 0.15;

        System.out.println("Nome do produto: " + p1.nome);
        System.out.println("Preço do produto: " + p1.preco);
        System.out.println("Produto com desconto: " +p1.precoComDesconto(0));

        Produto p2 = new Produto("caneta", 2.5); //construtor com todos os parametros
        System.out.println(p2.nome);
        System.out.println(p2.preco);
        System.out.println(p2.precoComDesconto());
    }
}
